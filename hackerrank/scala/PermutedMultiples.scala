package hackerrank.scala

// hackerrank euler #52
object PermutedMultiples {

  def isPermutation(num:String, num2:String): Boolean = num.diff(num2).length == 0 && num2.diff(num).length == 0

  def isPermuted(num:Long, k:Int):Unit = {

    def helper(iteration:Int = 1, acc:List[String] = List.empty): List[String] = {

      if (iteration > k) {
        // success case
        acc

      } else {

        val calcVal = num*iteration
        if (isPermutation(num.toString, calcVal.toString)) {

          helper(iteration + 1, calcVal.toString :: acc)

        } else {

          List.empty

        }

      }

    }

    helper() match {
      case List() =>
      case x => println(x.reverse.mkString(" "))
    }

  }

  def main(args: Array[String]) {

    val Array(n, k) = readLine.split(" ").map(_.toInt)

    (1 to n).foreach(isPermuted(_, k))

  }

}
