package hackerrank.scala

//hackerrank - #55 lychrel numbers
object LychrelNumbers {

  def isLychrel(num:BigInt, iteration:Int = 0):(BigInt, Boolean) = {
    if (iteration == 60) BigInt(0) -> false
    else {
      if (isPalindrome(num.toString)) num -> true
      else {
        val n = num + BigInt(num.toString.reverse)
        isLychrel(n, iteration + 1)
      }

    }
  }

  def isPalindrome(s:String):Boolean = s.equalsIgnoreCase(s.reverse)

  def main(args: Array[String]): Unit = {

    val n = readInt
    val result = (1 to n).map( p => isLychrel(p) ).filter(_._2).groupBy(_._1).maxBy(_._2.size)
    println(result._1 + " " + result._2.size)

  }

}
