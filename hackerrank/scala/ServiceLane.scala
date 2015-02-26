package hackerrank.scala

// hackerrank - service lane
object ServiceLane {

  def main(args: Array[String]) {

    val Array(_, t) = readLine.split(' ').map(_.toInt)

    val lane = readLine.split(' ').map(_.toInt)

    for (i <- 1 to t) {
      val Array(begin, end) = readLine.split(' ').map(_.toInt)
      println(lane.take(end+1).drop(begin).min)
    }

  }

}
