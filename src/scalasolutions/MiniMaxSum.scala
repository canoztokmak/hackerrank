package scalasolutions

// hackerrank - mini max sum
object MiniMaxSum {
  def main(args: Array[String]): Unit = {
    val numbers = readLine.split(" ").map(_.toLong).sorted
    val sum = numbers.sum
    println((sum - numbers.last) + " " + (sum - numbers.head))
  }
}
