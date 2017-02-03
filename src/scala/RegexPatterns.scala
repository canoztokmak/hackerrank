package scala

// hackerrank - regex patterns
object RegexPatterns {
  def main(args: Array[String]): Unit = {
    val pattern = "@gmail.com"
    println((1 to readInt).map(_ => readLine.split(" ")).filter {
      arr =>
        arr(1).contains(pattern)
    }.sortBy(_(0)).map(_(0)).mkString("\n"))
  }
}
