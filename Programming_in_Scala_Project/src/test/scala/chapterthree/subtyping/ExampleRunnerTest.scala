package chapterthree.subtyping

import org.scalatest.FunSuite

class ExampleRunnerTest extends FunSuite {

  test("Structural sub typing run gives Hello") {
    assert(ExampleRunner.run(new ExampleRunnerImplementation) == "Hello")
  }

}
