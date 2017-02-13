package scalasolutions

// hackerrank - equality in array
object EqualityInArray {
  def main(args: Array[String]): Unit = {
    val length = readInt
    println(length - readLine.split(" ").map(_.toInt).groupBy(identity).values.maxBy(_.length).length)
  }
}
