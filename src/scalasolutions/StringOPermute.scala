package scalasolutions

// hackerrank - string-o-permute
object StringOPermute {

  def main(args: Array[String]) {

    for (i <- 1 to readLine.toInt) {
      println(func(readLine.toList).mkString(""))
    }

  }

  def func(list: List[Char]):List[Char] = {
    list match {
      case List() => List()
      case _ =>
        list(1) :: list(0) :: func(list.drop(2))
    }
  }

}
