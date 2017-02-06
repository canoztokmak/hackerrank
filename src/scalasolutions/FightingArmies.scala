package scalasolutions

import scala.collection.mutable
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Success

// hackerrank - fighting armies
object FightingArmies {
  def main(args: Array[String]) {
    var Array(n, q) = readLine.split(" ").map(_.toInt)

    var armies: Array[mutable.PriorityQueue[Int]] = (1 to n).map(_ => mutable.PriorityQueue.empty[Int]).toArray
    var mergedArmies: mutable.Map[Int, Set[Int]] = mutable.Map.empty[Int, Set[Int]]

    (1 to q).foreach { _ =>
//      val line = readLine
//      println(line)
      readLine.split(" ") match {
        case Array("1", i) =>
          mergedArmies.get(i.toInt-1) match {
            case None => println(armies(i.toInt-1).head)
            case Some(set) => println(set.map(index =>
              if (armies(index).isEmpty) 0
              else armies(index).head
            ).max)
          }
        case Array("2", i) =>
          mergedArmies.get(i.toInt-1) match {
            case None => armies(i.toInt-1) = armies(i.toInt-1).tail
            case Some(set) =>
              val maxIndex = set.map(index =>
                if (armies(index).isEmpty) index -> 0
                else index -> armies(index).head
              ).maxBy(_._2)
              armies(maxIndex._1) = armies(maxIndex._1).tail
          }
        case Array("3", i, c) => armies(i.toInt-1) += c.toInt
        case Array("4", i, j) =>
          mergedArmies.get(i.toInt-1) match {
            case None =>
              mergedArmies += i.toInt-1 -> (Set(i.toInt-1, j.toInt-1) ++ mergedArmies.getOrElse(j.toInt-1, Set()))
            case Some(set) =>
              mergedArmies += i.toInt-1 -> ((set + (j.toInt-1)) ++ mergedArmies.getOrElse(j.toInt-1, Set()))
          }
      }
    }








//    val Array(n, q) = readLine.split(" ").map(_.toInt)
//    var armies: Array[mutable.PriorityQueue[Int]] = (1 to n).map(_ => mutable.PriorityQueue.empty[Int]).toArray
//
//    for {
//      f <- (1 to q).map(_ => readLine.split(" "))
//      _ = f match {
//            case Array("1", i) => println(armies(i.toInt - 1).head)
//            case Array("2", i) => armies(i.toInt - 1) = armies(i.toInt - 1).tail
//            case Array("3", i, c) => armies(i.toInt - 1) += c.toInt
//            case Array("4", i, j) => armies(i.toInt - 1) ++= armies(j.toInt - 1)
//          }
//    } yield ""

//    for {
//      _ <- 1 to q
//      f = Future(readLine.split(" "))
//      _ = f.onComplete { r => r.get match {
//          case Array("1", i) => println(armies(i.toInt - 1).head)
//          case Array("2", i) => armies(i.toInt - 1) = armies(i.toInt - 1).tail
//          case Array("3", i, c) => armies(i.toInt - 1) += c.toInt
//          case Array("4", i, j) => armies(i.toInt - 1) ++= armies(j.toInt - 1)
////          case arr => println(arr.mkString(" "))
//        }
//      }
//    } yield ""

//    (1 to q).map(_ => Future(readLine.split(" "))).foreach(_.onComplete { line =>
////      println(line.get.mkString(" "))
//
//      line.get match {
//        case Array("1", i) => println(armies(i.toInt-1).head)
//        case Array("2", i) => armies(i.toInt-1) = armies(i.toInt-1).tail
//        case Array("3", i, c) => armies(i.toInt-1) += c.toInt
//        case Array("4", i, j) => armies(i.toInt-1) ++= armies(j.toInt-1)
//      }
//    })

//    f.foreach { ln =>
////    io.Source.stdin.bufferedReader().lines().forEach { ln =>
////    io.Source.fromFile("/Users/canoztokmak/Desktop/c.txt").getLines().foreach { ln =>
//      if (i == 0) {
//        var Array(n, q) = ln.split(" ").map(_.toInt)
//        armies = (1 to n).map(_ => mutable.PriorityQueue.empty[Int]).toArray
//        qTotal = q
//        i += 1
//      } else {
//        ln.split(" ") match {
//          case Array("1", i) => println(armies(i.toInt-1).head)
//          case Array("2", i) => armies(i.toInt-1) = armies(i.toInt-1).tail
//          case Array("3", i, c) => armies(i.toInt-1) += c.toInt
//          case Array("4", i, j) => armies(i.toInt-1) ++= armies(j.toInt-1)
//        }
//
//        i += 1
//      }
//
//      if (i > qTotal) {
//        println(System.currentTimeMillis() - start)
//        System.exit(0)
//      }
//    }

  }
}
