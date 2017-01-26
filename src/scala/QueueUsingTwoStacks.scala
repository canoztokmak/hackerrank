package scala

// hackerrank - queue using two stacks
object QueueUsingTwoStacks {

  def main(args: Array[String]): Unit = {
    val stack1: java.util.Stack[Int] = new java.util.Stack[Int]
    val stack2: java.util.Stack[Int] = new java.util.Stack[Int]
    (1 to readInt).foreach( _ =>
      readLine.split(" ").map(_.toInt) match {
        case Array(t, value) => stack1.push(value)
        case Array(2) =>
          if (stack2.empty()) {
            while (!stack1.empty()) {
              stack2.push(stack1.pop())
            }
          }

          // dequeue
          stack2.pop()
        case Array(3) =>
          if (stack2.empty()) {
            while (!stack1.empty()) {
              stack2.push(stack1.pop())
            }
          }

          // print
          println(stack2.peek())
      }
    )
  }
}
