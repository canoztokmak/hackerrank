package scalaexamples

/**
 * Created by oztokmakc on 19/02/15.
 */
// hackerrank - pangrams
object Pangrams {

  def main(args: Array[String]) {

    if (readLine.replaceAll(" ", "").toLowerCase.distinct.size == 26)
      println("pangram")
    else println("not pangram")

  }

}
