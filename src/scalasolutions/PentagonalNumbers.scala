package scalasolutions

// hackerrank - pentagonal numbers
object PentagonalNumbers {
  var memo: Map[Int, Long] = Map.empty

  def calculate(n: Int): Long = {
    memo.get(n) match {
      case None =>
        if (n == 0) 0
        else if (n == 1) 1
        else {
          val prev = calculate(n-1)
          memo += (n-1 -> prev)
          2 * prev - calculate(n-2) + 3
        }

      case Some(r) => r
    }
  }

  def main(args: Array[String]): Unit = {
    (1 to readInt).foreach { _ =>
      val result = calculate(readInt)
      println(result)
    }
  }
}
