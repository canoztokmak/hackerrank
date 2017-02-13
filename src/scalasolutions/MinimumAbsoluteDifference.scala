package scalasolutions

// hackerrank - minimum absolute difference
object MinimumAbsoluteDifference {
  def main(args: Array[String]): Unit = {
    readInt
    val sorted = readLine.split(" ").map(_.toInt).sorted
    val result = sorted.sliding(2).map {
      c =>
        Math.abs(c(0) - c(1))
    }
    println(result.min)
  }
}
