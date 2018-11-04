package chaptertwo.packageobjects

import chaptertwo.packageobjects.innerpackageone.MethodsObject
import org.scalatest.FunSuite

class MethodsObjectTest extends FunSuite {

  test("MethodsObject exposed object is exposed") {
    assert(MethodsObject.methodsObjectRunExposed == "Hello")
  }

}
