package scalasolutions

// hackerrank - big sorting
object BigSorting {
  def main(args: Array[String]): Unit = {
    var xs: List[String] = List.empty

    (1 to readInt).foreach {
      _ => xs = readLine :: xs
    }

    println(xs.sortWith {
      (s1, s2) =>
        if (s1.length > s2.length) false
        else if (s2.length > s1.length) true
        else {
          val result = for (index <- 0 until s1.length
               if s1(index) != s2(index)) yield s1(index) < s2(index)

          result.headOption.getOrElse(false)
        }
    } mkString "\n")
  }
}
