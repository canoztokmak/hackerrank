package scalasolutions

// hackerrank - fibonacci
object Fibonacci {
  var memo: Map[Int, BigInt] = Map.empty

  def fibo(n: Int): BigInt = {
    memo.get(n) match {
      case None =>
        if (n == 0) 0
        else if (n == 1) 1
        else {
          val prev = fibo(n - 1)
          memo += (n-1 -> prev)
          fibo(n-2) + fibo(n-1)
        }
      case Some(f) => f
    }
  }

  def main(args: Array[String]): Unit = {
    (1 to readInt).foreach { _ =>
      println(fibo(readInt) % 100000007)
    }
  }
}
