package scala

// hackerrank - rotate string
object RotateString {

  def rotate(str:String, index: Int = 1) {
    val newStr = str.tail + str.head
    print(newStr + " ")

    if (index == str.length) println
    else rotate(newStr, index + 1)
  }

  def main(args: Array[String]) {

    for (i <- 1 to readInt) {
      rotate(readLine)
    }

  }

}
