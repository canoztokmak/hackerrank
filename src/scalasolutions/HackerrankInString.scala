package scalasolutions

/// hackerrank - hackerrank in a string
object HackerrankInString {
  val hackerrank = "hackerrank"

  def solve(input: String, index: Int = 0): Unit = {
//    println(input)
    input match {
      case str if str.isEmpty =>
        println("NO")
      case str =>
        if (str.head == hackerrank(index)) {
          if (index + 1 == hackerrank.length) {
            println("YES")
          } else {
            solve(str.tail, index+1)
          }
        } else {
          solve(str.tail, index)
        }
    }
  }

  def main(args: Array[String]): Unit = {
    (1 to readInt).foreach { _ =>
      solve(readLine())
    }
  }
}
