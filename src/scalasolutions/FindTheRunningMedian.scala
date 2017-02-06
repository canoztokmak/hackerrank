package scalasolutions

import scala.collection.mutable.PriorityQueue

// hackerrank - find the running median
object FindTheRunningMedian {
  def main(args: Array[String]): Unit = {
    var low: PriorityQueue[Int] = PriorityQueue.empty[Int](Ordering[Int].reverse)
    var high: PriorityQueue[Int] = PriorityQueue.empty[Int]

    (1 to readInt).foreach { _ =>
      if (low.size == high.size) {
        low += readInt
      } else {
        high += readInt
      }

      while (high.nonEmpty && high.head > low.head) {
        high.enqueue(low.dequeue())
        low.enqueue(high.dequeue())
      }

      if (low.size == high.size) println((high.head + low.head)/2.toDouble)
      else println(low.head.toDouble)
    }
  }
}
