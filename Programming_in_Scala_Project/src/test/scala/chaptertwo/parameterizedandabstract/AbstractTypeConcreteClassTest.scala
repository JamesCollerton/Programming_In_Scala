package chaptertwo.parameterizedandabstract

import org.scalatest.FunSuite

class AbstractTypeConcreteClassTest extends FunSuite {

  test("Abstract Type Works") {
    assert(new AbstractTypeConcreteClass().run == "Hello")
  }

}
