package scalasolutions

// hackerrank - string compression
object StringCompression {

  def main(args: Array[String]) {

    println(func(readLine))

  }

  def func(str:String):String = {

    def funcHelper(list:List[Char], count: Int = 1, ch: Char = '0'):List[Char] = {
      list match {
        case List() =>
          if (count != 1) {
            List(ch) ++ count.toString.toList
          } else {
            List(ch)
          }
        case x :: xs =>
          if (x == ch) {
            funcHelper(xs, count + 1, x)
          } else if (count != 1) {
            List(ch) ++ count.toString.toList ++ funcHelper(xs, 1, x)
          } else {
            ch :: funcHelper(xs, 1, x)
          }
      }
    }

    funcHelper(str.tail.toList, 1, str.head).mkString("")

  }

}
