package scalasolutions

// hackerrank - ransom note
object RansomNote {

  def main(args: Array[String]): Unit = {
    readLine
    val magazine = readLine
    val ransom = readLine

    if (ransom.split(" ").diff(magazine.split(" ")).length == 0) println("Yes")
    else println("No")
  }

}
