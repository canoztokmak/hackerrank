package scalasolutions

// hackerrank - connecting towns
object ConnectingTowns {

  def main(args: Array[String]) {

    val n = readInt

    for (i <- 1 to n) {
      readLine
      println(readLine.split(' ').map(_.toInt).foldLeft(1.toLong)(_ % 1234567 * _ % 1234567) % 1234567)
    }

  }

}
