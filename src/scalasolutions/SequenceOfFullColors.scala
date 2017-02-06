package scalasolutions

//hackerrank - sequence of full colors
object SequenceOfFullColors {

  def fullColor(str:String) {

    if(calc(str)) println("True")
    else println("False")

  }

  def calc(str:String, red:Int = 0, green:Int = 0, blue:Int = 0, yellow:Int = 0): Boolean = {

    if (str.length == 0) return red == green && blue == yellow

    str.head match {
      case 'R' =>
        if (Math.abs(red + 1 - green) > 1) false
        else calc(str.tail, red + 1, green, blue, yellow)
      case 'G' =>
        if (Math.abs(red - green - 1) > 1) false
        else calc(str.tail, red, green + 1, blue, yellow)
      case 'B' =>
        if (Math.abs(blue + 1 - yellow) > 1) false
        else calc(str.tail, red, green, blue + 1, yellow)
      case 'Y' =>
        if (Math.abs(blue - yellow - 1) > 1) false
        else calc(str.tail, red, green, blue, yellow + 1)
    }

  }

  def main(args: Array[String]) {
    for (i <- 1 to readLine.toInt) {
      fullColor(readLine)
    }
  }
}