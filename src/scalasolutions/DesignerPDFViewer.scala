package scalasolutions

// hackerrank - designer pdf viewer
object DesignerPDFViewer {
  def main(args: Array[String]): Unit = {
    val heights = readLine.split(" ").map(_.toInt)
    val text = readLine.toCharArray

    val maxLetter = text.maxBy {
      c =>
        heights(c - 'a')
    }

    println(heights(maxLetter - 'a') * text.length)
  }
}
