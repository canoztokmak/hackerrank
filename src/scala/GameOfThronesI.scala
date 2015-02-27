package scala

// hackerrank - game of thrones - I
object GameOfThronesI {

  def main(args: Array[String]) {
    val str = readLine

    val counts = str.distinct.toCharArray map { c =>
      str.toCharArray.count(_ == c)
    }

    val result = counts.map(_ % 2).count( _ == 1) > 1

    if (result) println("NO") else println("YES")

  }

}
