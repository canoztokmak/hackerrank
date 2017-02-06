package scalasolutions

// hackerrank - #36 double base palindromes
object DoubleBasePalindromes {

  def main(args: Array[String]) {

    val Array(n, k) = readLine.split(" ").map(_.toInt)

    println((1 to n).filter(i => isPalindrome(i.toString) && isPalindrome(changeBase(i, k))).sum)

  }

  def changeBase(decimal:Int, base:Int): String = {

    var t = decimal
    var list:List[String] = List()
    while (t != 0) {
      list ::= (t % base).toString
      t = t / base
    }

    list.mkString

  }

  def isPalindrome(s:String): Boolean = {
    s.equalsIgnoreCase(s.reverse)
  }

}
