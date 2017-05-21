package scalasolutions

// hackerrank - the full counting sort
object TheFullCountingSort {
  def main(args: Array[String]): Unit = {
    val total = readInt
    val input = (1 to total).map {
      index =>
        val Array(n, s) = readLine.split(" ")

        if (index <= total / 2) {
          n.toInt -> "-"
        } else {
          n.toInt -> s
        }
    }

    val occurrences = input.groupBy(_._1)

    (0 to 99).foreach { n =>
      occurrences.get(n) match {
        case Some(list) =>
          print(list.map(_._2).mkString(" ") + " ")
        case None =>
      }
    }
  }
}
