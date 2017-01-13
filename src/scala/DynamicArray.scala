package scala

// hackerrank - dynamic array
object DynamicArray {

  def calcIndex(x: Int, lastAns: Int, N: Int): Int = {
    (x ^ lastAns) % N
  }

  def main(args: Array[String]) {
    var lastAns = 0

    var Array(length, trial) = readLine.split(" ").map(_.toInt)

    var seqList = (1 to length).map(_ => Array[Int]()).toArray

    (1 to trial).foreach{ _ =>
      var Array(q, x, y) = readLine.split(" ").map(_.toInt)
      var index = calcIndex(x, lastAns, length)

      q match {
        case 1 =>
          seqList(index) :+= y
        case 2 =>
          lastAns = seqList(index)(y % seqList(index).length)
          println(lastAns)
      }
    }
  }
}

