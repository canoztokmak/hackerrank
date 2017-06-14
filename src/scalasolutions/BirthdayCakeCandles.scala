package scalasolutions

// hackerrank - birthday cake candles
object BirthdayCakeCandles {
  def main(args: Array[String]) {
    readInt
    println(readLine.split(" ").map(_.toInt).groupBy(identity).maxBy(_._1)._2.length)
  }
}
