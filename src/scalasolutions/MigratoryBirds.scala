package scalasolutions

// hackerrank - migratory birds
object MigratoryBirds {
  def main(args: Array[String]): Unit = {
    readInt
    val grouped = readLine.split(" ").groupBy(identity)
    val maxCount = grouped.maxBy(_._2.length)._2.length
    println(grouped.filter(g => g._2.length == maxCount).keys.min)
  }
}
