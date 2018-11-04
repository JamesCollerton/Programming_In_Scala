package chapterthree.mixins

import org.scalatest.FunSuite

class ExampleClassTest extends FunSuite {

  test("Anonymous class override work") {
    val exampleClass = new ExampleClass with PrintLogging {
      override def work(work: String): String = {
        info("Enter") + " " + work + " " + info("Exit")
      }
    }
    assert(exampleClass.work("Test") == "INFO: Enter Test INFO: Exit")
  }

}
