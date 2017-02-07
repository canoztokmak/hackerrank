package scalasolutions

// hackerrank - bitwise and
object BitwiseAND {
  def main(args: Array[String]): Unit = {
    (1 to readInt).foreach { _ =>
      val Array(n, k) = readLine.split(" ").map(_.toInt)

      val results = for(a <- 1 to n;
                        b <- 1 until a)
        yield {
          val and = a & b
          if (and < k) and
          else -1
        }

      println(results.max)
    }
  }
}
