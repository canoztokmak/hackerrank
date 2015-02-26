package hackerrank.scala

// hackerrank - missing numbers
object MissingNumbers {

  def main(args: Array[String]) {

    readLine
    val listA = readLine.split(" ").map(_.toInt)
    readLine
    val listB = readLine.split(" ").map(_.toInt)

    val freqA = listA.groupBy(identity).mapValues(_.length)
    val freqB = listB.groupBy(identity).mapValues(_.length)

    println(listB.distinct.filter(t => freqA(t) != freqB(t)).sorted.mkString(" "))

  }

}
