package chaptertwo.implicitconversions

import org.scalatest.FunSuite

class ImplicitConversionsTest extends FunSuite {

  test("List(One, Two, Three) = One Two Three") {
    assert(ImplicitConversions.joiner(List("One", "Two", "Three")) == "One Two Three")
  }

  test("List(Word, Word) = Word Word") {
    assert(ImplicitConversions.joiner(List("Word", "Word")) == "Word Word")
  }

}
