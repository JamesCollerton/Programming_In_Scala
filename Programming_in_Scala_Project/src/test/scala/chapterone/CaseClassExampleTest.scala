package chapterone

import org.scalatest.FunSuite

class CaseClassExampleTest extends FunSuite {

  test("Companion object") {
    val example = CaseClassExample("Some value")
    assert(example.value == "Object value")
  }

}
