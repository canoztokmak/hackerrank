package scalasolutions

// hackerrank - sparse arrays
object SparseArrays {
  var memo: Map[String, Int] = Map.empty

  def main(args: Array[String]): Unit = {
    (1 to readInt).foreach {
      _ =>
        val str = readLine
        memo.get(str) match {
          case None =>
            memo += (str -> 1)

          case Some(count) =>
            memo += (str -> (count+1))
        }
    }

    (1 to readInt).foreach {
      _ =>
        memo.get(readLine) match {
          case None => println(0)
          case Some(count) => println(count)
        }
    }
  }
}
