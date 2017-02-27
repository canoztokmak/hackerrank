package scalasolutions

// hackerrank - simple text editor
object SimpleTextEditor {
  def main(args: Array[String]): Unit = {
    solve(0, readInt)
  }

  def solve(command: Int, maxCommand: Int, stack: Seq[String] = Seq.empty): Unit = {
    if (command != maxCommand) {
      readLine.split(" ") match {
        case Array(a, b) =>
          a.toInt match {
            case 1 =>
              val newStr = stack.headOption.getOrElse("") + b

              solve(command + 1, maxCommand, newStr +: stack)

            case 2 =>
              val newStr = stack.headOption.getOrElse("").dropRight(b.toInt)

              solve(command + 1, maxCommand, newStr +: stack)

            case 3 =>
              println(stack.head.charAt(b.toInt - 1))

              solve(command + 1, maxCommand, stack)
          }

        case Array(a) =>
          solve(command + 1, maxCommand, stack.tail)
      }
    }
  }
}
