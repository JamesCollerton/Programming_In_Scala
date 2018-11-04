package chapterthree.callbynamecallbyvalue

import org.scalatest.FunSuite

class CallByNameCallByValueTest extends FunSuite {

  test("Call by value") {
    assert(CallByNameCallByValue.callByValue("Hello") == "Hello")
  }

  test("Call by name") {
    assert(CallByNameCallByValue.callByName("Hello") == "Hello")
  }

}
