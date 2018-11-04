package chapterthree.operatoroverloading

import org.scalatest.FunSuite

class IsEvenTest extends FunSuite {

  test("Is even List(1, 2, 3, 4) = List(2, 4)") {
    assert(IsEven.apply(List(1, 2, 3, 4)) == List(2, 4))
  }

}
