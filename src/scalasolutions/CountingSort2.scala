package scalasolutions

// hackerrank - counting sort 2
object CountingSort2 {
  def main(args: Array[String]): Unit = {
    readInt
    val occurrences = readLine.split(" ").map(_.toInt).groupBy(identity)
    (0 to 99).foreach { n =>
      occurrences.get(n) match {
        case Some(list) => print(list.mkString(" ") + " ")
        case None =>
      }
    }
  }
}
