package scalasolutions

import java.util

// hackerrank - gridland metro
object GridlandMetro {
  def main(args: Array[String]): Unit = {
    val Array(n, m, k) = readLine.split(" ").map(_.toLong)
    var grid: Map[Long, Option[List[(Long, Long)]]] = Map.empty

    (1 to k.toInt).foreach { _ =>
      val Array(r, c1, c2) = readLine.split(" ").map(_.toLong)

      grid.getOrElse(r.toInt, None) match {
        case Some(list) =>
          grid += r -> Some(c1 -> c2 :: list)

        case None =>
          grid += r -> Some(List((c1, c2)))
      }
    }

    // println("grid:\n" + grid.mkString("\n"))

    val result = grid.mapValues { row =>
      row match {
        case Some(trains) =>
          mergeIntervals(trains).map {
            train => train._2 - train._1 + 1
          }.sum

        case None => 0
      }
    }.values

    println(m * n - result.sum)
  }

  def mergeIntervals(intervals: List[(Long, Long)]): List[(Long, Long)] = {
    val stack: util.Stack[(Long, Long)] = new util.Stack()
    intervals.sortBy(_._1).foreach {
      interval =>
        if (stack.isEmpty) {
          stack.push(interval)
        } else {
          val top = stack.peek()

          if (top._2 < interval._1) {
            stack.push(interval)
          } else if (top._2 < interval._2) {
            val popped = stack.pop()
            stack.push(popped._1, interval._2)
          }
        }
    }

    val merged = stack.toArray(Array[(Long, Long)]()).toList
    //println(s"$merged")
    merged
  }
}



