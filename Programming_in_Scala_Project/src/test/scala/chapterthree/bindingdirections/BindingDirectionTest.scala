package chapterthree.bindingdirections

import org.scalatest.FunSuite

class BindingDirectionTest extends FunSuite {

  test("Bind to left 3 and List(1, 2) gives 3, 1, 2") {
    assert(BindingDirection.bindLeft(3, List(1, 2)) == List(3, 1, 2))
  }

  test("Bind to right List(1, 2) and 3 gives 1, 2, 3") {
    assert(BindingDirection.bindRight(List(1, 2), 3) == List(1, 2, 3))
  }

}
