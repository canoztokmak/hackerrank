package scala

// hackerrank - making anagrams
object MakingAnagrams {

  def main(args: Array[String]) {
    val mapA = readLine.groupBy(identity).mapValues(_.length)
    val mapB = readLine.groupBy(identity).mapValues(_.length)

    val res = mapA ++ mapB.map { case (k,v) =>
      k -> Math.abs(v - mapA.getOrElse(k, 0))
    }

    println(res.filter(_._2 != 0).values.sum)
  }
}
