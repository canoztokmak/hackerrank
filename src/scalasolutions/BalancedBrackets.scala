package scalasolutions

// hackerrank - balanced brackets
object BalancedBrackets {

  val open = List('(', '{', '[')

  def iterate(input: List[Char], stack: List[Char]): String = {
//    println("iterating..")
//    println("input:", input)
//    println("stack:", stack)
    input match {
      case x :: xs =>
        if (open.contains(x)) {
          iterate(xs, x :: stack)
        } else {
          if (stack.isEmpty) "NO"
          else {
            x match {
              case ')' =>
                if (stack.head == '(') {
                  iterate(xs, stack.tail)
                } else {
                  "NO"
                }
              case '}' =>
                if (stack.head == '{') {
                  iterate(xs, stack.tail)
                } else {
                  "NO"
                }
              case ']' =>
                if (stack.head == '[') {
                  iterate(xs, stack.tail)
                } else {
                  "NO"
                }
            }
          }
        }
      case List() => if (stack.isEmpty) "YES" else "NO"
    }
  }

  def main(args: Array[String]) {
    (1 to readInt).foreach { _ =>
      println(iterate(readLine.toList, List()))
    }
  }
}
