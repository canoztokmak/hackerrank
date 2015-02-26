package hackerrank.scala

// hackerrank - pangrams
object Pangrams {

  val alphabetSize = 26

  def main(args: Array[String]) {

    if (readLine.replaceAll(" ", "").toLowerCase.distinct.size == alphabetSize)
      println("pangram")
    else println("not pangram")

  }

}
