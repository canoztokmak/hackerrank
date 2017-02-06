package scalasolutions

// hackerrank - maximizing xor
object MaximizingXOR {

  def maxXor(l: Int, r: Int): Int = {

    val tuples = for (
      x <- l to r;
      y <- l to r
    ) yield (x, y)

    val distances = tuples.map { t =>
      t._1 ^ t._2
    }

    distances.max

  }

  def main(args: Array[String]) {

    println(maxXor(readInt, readInt))

  }

}
