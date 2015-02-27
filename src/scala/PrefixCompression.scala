package scala

// hackerrank - prefix compression
object PrefixCompression {

  def findCommon(a:Stream[Char], b:Stream[Char], min:Int, length:Int = 0):Int = {
    if (length == min) length
    else if (a.head == b.head) findCommon(a.tail, b.tail, min, length+1)
    else length

  }

  def main(args: Array[String]) {

    val a = readLine
    val b = readLine
    val aSize = a.size
    val bSize = b.size

    val length = findCommon(a.toStream, b.toStream, Math.min(aSize, bSize))
    println(length + " " + a.take(length))
    println((aSize - length) + " " + a.drop(length))
    println((bSize - length) + " " + b.drop(length))
  }

}
