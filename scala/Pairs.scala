package scalaexamples

/**
 * Created by oztokmakc on 18/02/15.
 */
//hackerrank - pairs
object Pairs {

  def main(args: Array[String]) {

    val Array(n, k) = readLine.split(" ").map(_.toInt)

    val set = readLine.split(" ").toSet
    val count = set.count(p => set.contains((p.toInt + k).toString))

    System.out.println(count)

  }

}
