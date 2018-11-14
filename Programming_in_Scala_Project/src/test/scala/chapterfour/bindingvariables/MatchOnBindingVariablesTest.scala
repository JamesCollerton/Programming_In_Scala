package chapterfour.bindingvariables

import org.scalatest.FunSuite

class MatchOnBindingVariablesTest extends FunSuite {

  test("Match, first") {
    assert(MatchOnBindingVariables.matchOnBindingVariables("One", ("One", "Two", "Three")).getOrElse("") == "One")
  }

  test("Match, second") {
    assert(MatchOnBindingVariables.matchOnBindingVariables("Two", ("One", "Two", "Three")).getOrElse("") == "Two")
  }

  test("Match, third") {
    assert(MatchOnBindingVariables.matchOnBindingVariables("Three", ("One", "Two", "Three")).getOrElse("") == "Three")
  }

}
