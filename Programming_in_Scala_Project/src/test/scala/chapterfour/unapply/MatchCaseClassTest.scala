package chapterfour.unapply

import org.scalatest.FunSuite

class MatchCaseClassTest extends FunSuite {

  test("Match case class, first") {
    assert(MatchCaseClass.matchCaseClass("1", ExampleCaseClass("1", 2)) == "First")
  }

  test("Match case class, two") {
    assert(MatchCaseClass.matchCaseClass("2", ExampleCaseClass("1", 2)) == "Second")
  }

  test("Match case class, third") {
    assert(MatchCaseClass.matchCaseClass("None", ExampleCaseClass("1", 2)) == "None")
  }

}
