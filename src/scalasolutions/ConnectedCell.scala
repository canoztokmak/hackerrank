package scalasolutions

// hackerrank - connected cell in a grid
object ConnectedCell {
  def main(args: Array[String]): Unit = {
    val n = readInt
    val m = readInt

    val grid = (1 to n).map(_ => readLine.split(" "))

    var memo = Set[(Int, Int)]()

    val results = for (i <- 0 until n;
                       j <- 0 until m) yield {
      if (memo.contains(i -> j)) 0
      else {
        val result = solve(grid, i, j)
        memo ++= result
        result.size
      }
    }

    println(results.max)
  }

  def solve(grid: Seq[Array[String]], i: Int, j: Int, visited: Set[(Int, Int)] = Set()): Set[(Int, Int)] = {
    if (i < 0 || j < 0 || i >= grid.length || j >= grid(i).length) Set()
    else if (visited.contains(i -> j)) Set()
    else if (grid(i)(j).equalsIgnoreCase("0")) Set()
    else {
      val newVisited = visited + (i -> j)
      val around = for(x <- -1 to 1; y <- -1 to 1) yield {
        // if the below part is uncommented, it takes almost twice as long to finish the execution !!
        // WTF !!
//        if (x == 0 && y == 0) Set()
//        else {
          solve(grid, i + x, j + y, newVisited)
//        }
      }

      Set(i -> j) ++ around.reduce((a, b) => a ++ b)
    }
  }
}
