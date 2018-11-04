package chaptertwo.nestedfunctions

import org.scalatest.FunSuite

class NestedFunctionTest extends FunSuite {

  test("Factorial 5 = 120") {
    assert(NestedFunction.factorial(5) == 120)
  }

  test("Factorial 10 = 3628800") {
    assert(NestedFunction.factorial(10) == 3628800)
  }

  test("Factorial 3 = 6") {
    assert(NestedFunction.factorial(3) == 6)
  }

  test("Factorial 0 = 1") {
    assert(NestedFunction.factorial(0) == 1)
  }

}
