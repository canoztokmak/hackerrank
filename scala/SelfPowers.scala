package scalaexamples

/**
 * Created by oztokmakc on 05/02/15.
 */
//hackerrank euler #48
object SelfPowers {

  val mod = 10000000000l

  def specialPow(num:Long):Long = {

    def helper(n:Long, iteration:Long = 1):Long = {
      if (iteration == num) n
      else {
        helper((n*num) % mod, iteration + 1)
      }
    }

    helper(num)

  }

  def specialPow2(num:Long):Long = {

    BigInt(num).modPow(num, mod).toLong

  }

  def calculate(n:Long) = {

    (1l to n).foldLeft(0l) {
      (a,b) =>
        //println(s"$a $b")
        (a + specialPow2(b)) % mod
    }

  }

  def main(args: Array[String]) {

    println(calculate(readInt))

  }

}
