package hackerrank.scala

//hackerrank - pairs
object Pairs {

  def main(args: Array[String]) {

    val Array(n, k) = readLine.split(" ").map(_.toInt)

    val set = readLine.split(" ").toSet
    val count = set.count(p => set.contains((p.toInt + k).toString))

    println(count)

  }

}
