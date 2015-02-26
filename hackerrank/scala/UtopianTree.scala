package hackerrank.scala

// hackerrank - utopian tree
object UtopianTree {

  def grow(height: Int, cycle: Int): Int = {
    if (cycle % 2 == 0) height + 1
    else height * 2
  }

  def iterate(iterateTo: Int, height: Int = 1, cycle: Int = 1): Int = {

    if (iterateTo < cycle) height
    else iterate(iterateTo, grow(height, cycle), cycle + 1)

  }

  def main(args: Array[String]): Unit = {

    (1 to readInt).foreach(t => println(iterate(readInt)))

  }

}