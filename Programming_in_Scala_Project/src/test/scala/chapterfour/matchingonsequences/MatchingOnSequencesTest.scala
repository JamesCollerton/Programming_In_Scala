package chapterfour.matchingonsequences

import org.scalatest.FunSuite

class MatchingOnSequencesTest extends FunSuite {

  test("Match on tail 1, 2, 3") {
    assert(MatchingOnSequences.matchOnTerm(1, List(1, 2, 3)).getOrElse("") == "2, 3")
  }

  test("Match on tail 3, 4, 5") {
    assert(MatchingOnSequences.matchOnTerm(4, List(3, 4, 5)).getOrElse("") == "5")
  }

  test("Match on tail, no match") {
    assert(MatchingOnSequences.matchOnTerm(8, List(1, 2, 3)) == Option.empty)
  }

}
