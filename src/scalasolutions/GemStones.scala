package scalasolutions

// hackerrank - gem stones
object GemStones {

  def main(args: Array[String]): Unit = {

    val n = readInt

    val result = (1 to n).fold("")((a,_) => a + readLine.distinct)

    println(result.toString.toCharArray.groupBy(identity).count(_._2.size == n))

  }

}
