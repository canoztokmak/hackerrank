package scalasolutions

import scala.collection.mutable

// hackerrank - recursive staircase
object RecursiveStaircase {
  var memory: mutable.Map[Int, Int] = mutable.Map[Int, Int]()

  def main(args: Array[String]): Unit = {
    (1 to readInt).foreach { _ =>
      println(solve(readInt))
    }
  }

  def solve(step: Int): Int = {
    if (step == 0) 1
    else if (step == 1) {
      memory += (1 -> 1)
      1
    } else if (step == 2) {
      memory += (2 -> 2)
      2
    } else {
      memory.get(step) match {
        case None =>
          // calculate for step
          val sum = (1 to 3).map {
            s =>
              val result = solve(step - s)
              memory += (step-s -> result)
              result
          }.sum

          // add to memory
          memory += (step -> sum)

          sum
        case Some(c) =>
          c
      }
    }
  }
}
