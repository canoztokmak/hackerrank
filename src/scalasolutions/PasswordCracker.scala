package scalasolutions

// hackerrank - password cracker
object PasswordCracker {
  var memo: Map[String, List[String]] = Map.empty

  def solve(loginAttempt: String, passwords: List[String], result: List[String] = List.empty): Option[List[String]] = {
    if (loginAttempt.isEmpty) Some(result)
    else {
      memo.get(loginAttempt) match {
        case Some(memoized) =>
          if (memoized.isEmpty) {
            None
          } else {
            Some(memoized)
          }
        case None =>
          var finalResult: List[String] = List.empty
          val exists = passwords.exists {
            p =>
              if (loginAttempt.startsWith(p)) {
                solve(loginAttempt.drop(p.length), passwords, p :: result) match {
                  case Some(r) =>
                    finalResult = r
                    memo += loginAttempt -> r
                    true
                  case None => false
                }
              } else {
                memo += loginAttempt -> List.empty
                false
              }
          }

          if (exists) {
            Some(finalResult)
          } else {
            None
          }
      }
    }
  }

  def main(args: Array[String]): Unit = {
    (1 to readInt).foreach { _ =>
      readInt
      val passwords = readLine.split(" ").sortBy(_.length)(Ordering[Int].reverse)
      val loginAttempt = readLine

      val charsInPasswords = passwords.mkString("").groupBy(identity).keySet
      val charsInAttempt = loginAttempt.groupBy(identity).keySet

      if (charsInAttempt.diff(charsInPasswords).nonEmpty) println("WRONG PASSWORD")
      else {
        memo = Map.empty
        solve(loginAttempt, passwords.toList) match {
          case Some(r) => println(r.reverse.mkString(" "))
          case None => println("WRONG PASSWORD")
        }
      }
    }
  }
}
