package scalasolutions

// hackerrank - counting sort 3
object CountingSort3 {
  def main(args: Array[String]): Unit = {
    val occurrences = (1 to readInt).map(_ => readLine.split(" ")(0).toInt).groupBy(identity)
    var index = 0
    (0 to 99).foreach { n =>
      occurrences.get(n) match {
        case Some(list) =>
          index += list.length
          print(index + " ")

        case None => print(index + " ")
      }
    }
  }
}
