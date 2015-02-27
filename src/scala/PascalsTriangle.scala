package scala

// hackerrank - pascal's triangle
object PascalsTriangle {

  def main(args: Array[String]) {
    (0 to readInt-1).foreach(f => println(pascalRow(f).mkString(" ")))
  }

  def pascalRow(row:Int):Seq[Int] = {
    for (i <- 0 to row) yield pascalCell(row, i)
  }

  def pascalCell(row:Int, col:Int):Int = {
    fact(row) / fact(col) / fact(row-col)
  }

  def fact(num: Int): Int = {
    (1 to num).product
  }

}
