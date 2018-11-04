package chapterthree.forloopcomprehensions

import org.scalatest.FunSuite

class ForLoopComprehensionsTest extends FunSuite {

  test("For loop, List(1, 2, 3), isEven gives 2") {
    assert(ForLoopComprehensions.filterForLoop(List(1, 2, 3))(_ % 2 == 0) == List(2))
  }

  test("For loop, List(Some(1), Some(2), Some(3), None), double gives List(2, 4, 6)") {
    assert(ForLoopComprehensions.loopMap(List(Some(1), Some(2), Some(3), None))(_ * 2) == List(2, 4, 6))
  }

}
