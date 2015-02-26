package scalaexamples

/**
 * Created by oztokmakc on 11/02/15.
 */
// hackerrank - encryption
object Encryption {

  def printString(input:String, row:Int, column:Int) = {

    val r = if (column == row) row-1 else row

    for (j <- 0 to r) {
      for (i <- 0 to column) {
        val index = i * column + j
        if (index < input.length)
          print(input(index))
      }
      print(" ")
    }

  }

  def main(args: Array[String]): Unit = {
    val input = readLine.replaceAll(" ", "")

    val sqrt = math.sqrt(input.length)

    val ceil = math.ceil(sqrt)
    val floor = math.floor(sqrt)

    printString(input, floor.toInt, ceil.toInt)

  }

}
