package hackerrank.scala

//hackerrank - filter elements
object FilterElements {

  def filterNumbers(arr:Array[Int], size:Int, n:Int, k:Int): (Array[Int], Boolean) = {

    def helper(result:Array[Int] = new Array[Int](n), index:Int = 0, counts:Map[Int, Int] = Map.empty,
               firsts:Map[Int, Int] = Map.empty, found:Boolean = false): (Array[Int], Boolean) = {

      if (size == index) {
        result -> found
      } else {

        val number = arr(index)
        val newFirsts = firsts.get(number) match {
          case None => firsts + (number -> index)
          case _ => firsts
        }

        val newCount = counts.getOrElse(number, 0) + 1

        if (newCount == k) {
          result.update(newFirsts(number), number)
          helper(result, index + 1, counts + (number -> k), newFirsts, true)
        } else {
          helper(result, index + 1, counts + (number -> newCount), newFirsts, found)
        }

      }

    }

    helper()

  }

  def main(args:Array[String]): Unit = {

    for (i <- 1 to readInt) {
      val Array(n, k) = readLine.split(" ").map(_.toInt)

      val arr = readLine.split(" ").map(_.toInt)

      filterNumbers(arr, arr.size, n, k) match {
        case (results, true) => results.foreach(p => if (p > 0) print(p + " "))
          println
        case _ => println("-1")
      }

    }

  }

}



