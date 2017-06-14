package scalasolutions

import scala.collection.mutable

// hackerrank - gaming array
object GamingArray {
  def solve(maxIndex: Int, pq: mutable.PriorityQueue[(Long, Int)], step: Int = 0): Unit = {
    if (maxIndex == 0) {
      if (step % 2 == 0) {
        println("ANDY")
      } else {
        println("BOB")
      }
    } else {
      val max = pq.dequeue()
      if (max._2 >= maxIndex) {
        solve(maxIndex, pq, step)
      } else {
        solve(max._2, pq, step + 1)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    (1 to readInt).foreach { _ =>
      val maxIndex = readInt
      val input = readLine.split(" ").map(_.toLong)

      val pq: mutable.PriorityQueue[(Long, Int)] = mutable.PriorityQueue(input.zipWithIndex: _*)

      solve(maxIndex, pq)
    }
  }
}
