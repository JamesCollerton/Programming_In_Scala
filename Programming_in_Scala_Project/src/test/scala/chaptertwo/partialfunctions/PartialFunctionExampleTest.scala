package chaptertwo.partialfunctions

import org.scalatest.FunSuite

class PartialFunctionExampleTest extends FunSuite {

  test("Partial function composition, string") {
    assert(PartialFunctionExample.partialFunctionStringInteger("S") == "String")
  }

  test("Partial function composition, integer") {
    assert(PartialFunctionExample.partialFunctionStringInteger(0) == "Integer")
  }

}
