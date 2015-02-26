package hackerrank.scala

// hackerrank - sherlock and permutations
object SherlockAndPermutations {

  val mod = 1000000007

  def main(args: Array[String]) {

    (1 to readInt).foreach { t =>
      val Array(a, b) = readLine.split(" ").map(_.toInt)
      println(perm(a, b-1))
    }

  }

  def perm(x: Int, y: Int): BigInt = {
    fact(x+y) / fact(x) / fact(y) % mod
  }

  def fact(n: BigInt): BigInt = {
    if (n <= 1) 1
    else n * fact(n - 1)
  }

}
