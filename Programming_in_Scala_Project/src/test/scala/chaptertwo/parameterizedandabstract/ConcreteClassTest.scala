package chaptertwo.parameterizedandabstract

import org.scalatest.FunSuite

class ConcreteClassTest extends FunSuite {

  test("Overriden method is correct") {
    assert(new ConcreteClass().run == 1)
  }

}
