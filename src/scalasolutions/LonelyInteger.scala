package scalasolutions

// hackerrank - lonely integer
object LonelyInteger {

  def main(args: Array[String]) {
    readLine
    val numbers = readLine.split(" ")
//    println(numbers.groupBy(identity).filter(_._2.size == 1).head._1)
    println(numbers.map(_.toInt).reduce((a,b) => a ^ b))

  }

}
