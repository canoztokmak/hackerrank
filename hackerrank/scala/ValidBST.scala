package hackerrank.scala

// hackerrank - valid bst
object ValidBST {

  trait Node {
    def parent: Option[Node]
  }
  case class Empty(parent: Option[Node]) extends Node

  case class Filled(value: Int, parent: Option[Node] = None) extends Node

  case class BinaryTree(root: Filled, left: Option[BinaryTree] = None, right: Option[BinaryTree] = None) {

    def add(input: Int): Option[BinaryTree] = {
      if (input > root.value) {
        right match {
          case None => Some(copy(right = Some(BinaryTree(Filled(input)))))
          case Some(rightTree) => rightTree.add(input).fold(None: Option[BinaryTree])(newRight => Some(copy(right = Some(newRight))))
        }
      } else {
        if (right.isDefined) {
          None
        } else {
          left match {
            case None => Some(copy(left = Some(BinaryTree(Filled(input)))))
            case Some(leftTree) => leftTree.add(input).fold(None: Option[BinaryTree])(newLeft => Some(copy(left = Some(newLeft))))
          }
        }

      }
    }

  }


  def track(tree: BinaryTree, arr: Array[Int], index: Int = 1): Boolean = {

    if (index == arr.length) {
      true
    } else {
      tree.add(arr(index)).fold(false)(track(_, arr, index + 1))
    }

  }

  def testCases(T: Int, index: Int = 1): Unit = {
    if (index > T) {
      println()
    } else {

      readInt
      val arr = readLine.split(" ").map(_.toInt)

      if (track(BinaryTree(Filled(arr(0))), arr)) {
        println("YES")
      } else {
        println("NO")
      }
      testCases(T, index + 1)

    }
  }

  def main(args: Array[String]) {
    testCases(readInt)
  }

}
