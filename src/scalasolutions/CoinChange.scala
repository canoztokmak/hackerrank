package scalasolutions

// hackerrank - coin change
object CoinChange {
  def main(args: Array[String]): Unit = {
    val Array(n, _) = readLine.split(" ").map(_.toInt)
    val coins = readLine.split(" ").map(_.toInt)

    var memo: Array[Long] = Array.fill(n+1){0l}
    memo(0) = 1l

    for (coin <- coins;
         remaining <- coin to n) yield {
      memo(remaining) += memo(remaining - coin)
//      println(memo.mkString(" ") + s" || $coin - $remaining")
    }

    println(memo(n))
  }
}
