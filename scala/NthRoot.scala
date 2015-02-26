package scalaexamples

object NthRoot {

  def nthroot1(n: Int, a: Double): Double = {
    def loop(x0: Double) : Double = {
      val x1 = (1.0d/n * ((n - 1) * x0 + a/math.pow(x0, n-1)))
      if (x0 <= x1) x0
      else loop(x1)
    }

    loop(a/2)
  }

  def main(args: Array[String]) {
    println(nthroot1(3, 32))
  }

}

