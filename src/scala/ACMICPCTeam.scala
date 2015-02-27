package scala

// hackerrank - acm icpc team
object ACMICPCTeam {

  def main(args: Array[String]) {

    val Array(n, m) = readLine.split(" ").map(_.toInt);

    val list = for (a <- 1 to n) yield(readLine)

    var count = 0
    var best = 0

    for (
      i <- 0 until n;
      j <- i+1 until n
    ) yield {

      val res = BigInt(list(i), 2) | BigInt(list(j), 2)

      val newBest = res.toString(2).count( _ == '1')

      if (newBest > best) {
        best = newBest
        count = 1
      } else if (newBest == best) {
        count = count + 1
      }

    }

    println(best)
    println(count)

  }

}
