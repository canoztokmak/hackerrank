package scalasolutions

// hackerrank - counting sort 1
object CountingSort1 {
  def main(args: Array[String]): Unit = {
    readInt
    val occurrences = readLine.split(" ").map(_.toInt).groupBy(identity)
    (0 to 99).foreach { n =>
      occurrences.get(n) match {
        case Some(list) => print(list.length + " ")
        case None => print(0 + " ")
      }
    }
  }
}
