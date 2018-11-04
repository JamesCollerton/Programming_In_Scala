package chaptertwo.parameterizedandabstract

import org.scalatest.FunSuite

class ParameterizedAbstractConcreteClassTest extends FunSuite {

  test("Overriden method is correct") {
    assert(new ParameterizedAbstractConcreteClass().run == 1)
  }

}
