package scala

// hackerrank - equal stacks
object EqualStacks {
//  more elegant solution but fails with timeout
//  def solve(sums: Array[Int], s0: Array[Int], s1: Array[Int], s2: Array[Int]): Unit = {
//    if (sums.forall(_ == sums.head)) println(sums.head)
//    else {
//      sums.indexOf(sums.max) match {
//        case 0 =>
//          sums(0) -= s0.head
//          solve(sums, s0.tail, s1, s2)
//        case 1 =>
//          sums(1) -= s1.head
//          solve(sums, s0, s1.tail, s2)
//        case 2 =>
//          sums(2) -= s2.head
//          solve(sums, s0, s1, s2.tail)
//      }
//    }
//  }
//
//  def main(args: Array[String]) {
//    readLine
//    val s0 = readLine.split(" ").map(_.toInt)
//    val s1 = readLine.split(" ").map(_.toInt)
//    val s2 = readLine.split(" ").map(_.toInt)
//
//    val sums = Array(s0.sum, s1.sum, s2.sum)
//
//    solve(sums, s0, s1, s2)
//
//  }

  def main(args: Array[String]) {
    readLine
    val start = System.currentTimeMillis()
    var acc = 0
    val s0 = readLine.split(" ").reverse.map { i =>
      acc += i.toInt
      acc
    }
    acc = 0
    val s1 = readLine.split(" ").reverse.map { i =>
      acc += i.toInt
      acc
    }
    acc = 0
    val s2 = readLine.split(" ").reverse.map { i =>
      acc += i.toInt
      acc
    }

    solve2(s0, s1, s2)

  }

  def solve2(s0: Array[Int], s1: Array[Int], s2: Array[Int]): Unit = {
    val result = s0.intersect(s1).intersect(s2)
    if (result.nonEmpty) println(result.last)
    else println(0)
  }
}
