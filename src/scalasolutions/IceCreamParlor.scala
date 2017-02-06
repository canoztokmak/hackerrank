package scalasolutions

// hackerrank - ice cream parlor
// with binary search
object IceCreamParlor {
  def main(args: Array[String]): Unit = {
    (1 to readInt).foreach { _ =>
      val money = readInt
      readInt
      val flavors = readLine.split(" ").map(_.toInt)
      val sorted = flavors.sorted

      val result = solve(money, sorted)
      if (result._1 == result._2) {
        println((flavors.indexOf(result._1)+1) + " " + (flavors.lastIndexOf(result._1)+1))
      } else {
        val indexes = Array[Int](flavors.indexOf(result._1)+1, flavors.indexOf(result._2)+1).sorted
        println(indexes.mkString(" "))
      }
    }
  }

  def solve(money: Int, flavors: Array[Int]): (Int, Int) = {
    val remaining = money - flavors.head
    search(remaining, flavors.tail) match {
      case Some(x) => (flavors.head, remaining)
      case _ => solve(money, flavors.tail)
    }
  }

  def search(value: Int, arr: Array[Int]): Option[Int] = {
    if (arr.length == 0) None
    else {
      val middle = arr(arr.length/2)
      val middleIndex = arr.length/2
      if (middle == value) Some(middleIndex)
      else if (middle > value) {
        search(value, arr.take(middleIndex))
      } else {
        search(value, arr.takeRight(middleIndex))
      }
    }
  }
}
