package scalaexamples

/**
 * Created by oztokmakc on 19/02/15.
 */
// hackerrank - lonely integer
object LonelyInteger {

  def main(args: Array[String]) {

    readLine
    println(readLine.split(" ").groupBy(identity).filter(_._2.size == 1).head._1)

  }

}
