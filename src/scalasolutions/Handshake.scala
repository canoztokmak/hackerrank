package scalasolutions

// hackerrank - handshake
object Handshake {

  def main(args: Array[String]) {
    (1 to readInt).foreach{ t =>
      val n = readInt
      println((n * (n-1))/2)
    }
  }

}
