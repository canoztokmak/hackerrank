package scalasolutions

// hackerrank - cavity map
object CavityMap {

  def main(args: Array[String]) {
    val count = readInt

    val matrix = for (i <- 1 to count) yield(readLine.toCharArray)

    for (i <- 1 until count-1;
         j <- 1 until count-1) {
      isCavity(matrix, i, j) match {
        case true => matrix(i)(j) = 'X'
        case _ =>
      }
    }

    matrix.foreach { p =>
      p.foreach(print(_))
      println
    }

  }

  def isCavity(matrix: Seq[Array[Char]], i:Int, j:Int): Boolean = {

    val item = matrix(i)(j).toInt

    item > matrix(i)(j-1) &&
      item > matrix(i)(j+1) &&
      item > matrix(i-1)(j) &&
      item > matrix(i+1)(j)

  }

}
