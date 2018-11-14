package chapterfour.matchingontuples

import org.scalatest.FunSuite

class MatchingOnTuplesTest extends FunSuite {

  test("Match on tuple, first") {
    assert(MatchingOnTuples.matchOnTuple(1, (1, 2, 3)) == "First")
  }

  test("Match on tuple, second") {
    assert(MatchingOnTuples.matchOnTuple(2, (1, 2, 3)) == "Second")
  }

  test("Match on tuple, third") {
    assert(MatchingOnTuples.matchOnTuple(3, (1, 2, 3)) == "Third")
  }

  test("Match on tuple, none") {
    assert(MatchingOnTuples.matchOnTuple(4, (1, 2, 3)) == "None")
  }

}
