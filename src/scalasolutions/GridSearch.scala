package scalasolutions

// hackerrank - the grid search
object GridSearch {

  def checkMatch(small:Seq[String], large:Seq[String]): Boolean = {

    if (small.isEmpty) true
    else if (large.isEmpty) false
    else if (large.head.contains(small.head)) checkMatch(small.tail, large.tail)
    else false
  }

  def search(small:Seq[String], large:Seq[String]):Boolean = {

    if (small.isEmpty) true
    else if (large.isEmpty) false
    else if (checkMatch(small, large)) {
      true
    } else {
      search(small, large.tail)
    }

  }

  def main(args: Array[String]) {

    (1 to readInt).foreach { t =>

      val Array(lr, lc) = readLine.split(" ").map(_.toInt)
      val largeGrid = (1 to lr).map(l => readLine)

      val Array(sr, sc) = readLine.split(" ").map(_.toInt)
      val smallGrid = (1 to sr).map(l => readLine)

      if (search(smallGrid, largeGrid)) println("YES")
      else println("NO")

    }

  }

}
