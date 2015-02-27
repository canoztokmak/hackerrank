package scala

// hackerrank - string mingling
object StringMingling {

  def main(args: Array[String]) {

    val p = readLine
    val q = readLine

    p.zip(q) foreach { t =>
      print(t._1)
      print(t._2)
    }

  }

}
