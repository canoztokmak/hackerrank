package hackerrank.scala

// hackerrank - sansaXOR
object SansaXOR {

  def calcXOR(arr:Array[String], acc:Long, i:Int = 2): Long = {

    if (i >= arr.length) acc
    else calcXOR(arr, acc ^ arr(i).toLong, i+2)

  }

  def main(args: Array[String]) {

    val t = readInt()

    (1 to t).foreach { test =>
      val n = readInt()

      if (n % 2 == 0) {
        readLine
        println(0)
      } else {
        val arr = readLine.split(" ")

        println(calcXOR(arr, arr(0).toLong))

      }

    }

  }

}
