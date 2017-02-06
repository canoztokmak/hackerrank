package scalasolutions

// hackerrank - and product
object ANDProduct {

  val log2 = math.log(2)

  def log2(num:Long):Double = math.log(num) / log2

  def calcAND(index:Long, limit:Long, acc:Long): Long = {
    if (index > limit) acc
    else calcAND(index + 1, limit, acc & index)
  }

  def main(args: Array[String]) {

    (1 to readInt).foreach { t =>

      val Array(a, b) = readLine.split(" ").map(_.toLong)

      val loga = log2(a)
      val logb = log2(b)

      if (math.abs(loga - logb).toInt > 0) println(0)
      else {
        println(calcAND(a+1, b, a))
      }

    }

  }

}
