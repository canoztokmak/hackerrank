package scala

// hackerrank - maximum element
object MaximumElement {

  def main(args: Array[String]) {
    var stack = List[Int]()
    var maxStack = List[Int]()
    var max = 0

    (1 to readInt).foreach { _ =>
      val arr = readLine.split(" ").map(_.toInt)
      arr.length match {
        case 1 =>
          arr(0) match {
            case 2 =>
              if (stack.head == max) {
                if (maxStack.tail.nonEmpty) {
                  max = maxStack.tail.head
                } else {
                  max = 0
                }
              }
              stack = stack.tail
              maxStack = maxStack.tail
            case 3 => println(max)
          }
        case 2 =>
          stack +:= arr(1)
          max = Math.max(arr(1), max)
          maxStack +:= max
      }
    }
  }
}
