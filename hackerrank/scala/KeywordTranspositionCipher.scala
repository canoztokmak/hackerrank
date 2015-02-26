package hackerrank.scala

//hackerrank - keyword transposition cipher
object KeywordTranspositionCipher {

  val original = Array( 'A', 'B', 'C', 'D', 'E',
                        'F', 'G', 'H', 'I', 'J',
                        'K', 'L', 'M', 'N', 'O',
                        'P', 'Q', 'R', 'S', 'T',
                        'U', 'V', 'W', 'X', 'Y',
                        'Z')

  def getChunk(subs:Array[Char], keywordSize:Int, i:Int, acc:Array[Char] = Array()): Array[Char] = {

    if (i < subs.size) {
      getChunk(subs, keywordSize, i+keywordSize, acc ++ Array(subs(i)))
    } else {
      acc
    }

  }

  def getSubsArray(keyword: Array[Char]): Array[Char] = {

    val substitution = keyword ++ original.diff(keyword)

    keyword.sorted.flatMap(k => getChunk(substitution, keyword.size, substitution.indexOf(k)))

  }

  def main(args: Array[String]): Unit = {

    (1 to readInt).foreach { t =>

      val keyword = readLine.distinct.toCharArray
      val ciphertext = readLine

      val substitution = getSubsArray(keyword)

      ciphertext.foreach(c =>
        if (c == ' ') print(" ")
        else print(original(substitution.indexOf(c)))
      )
      println

    }

  }

}
