package chapterfour.matchingontuples

object MatchingOnTuples {

  def matchOnTuple[A](term: A, tuple: (Any, Any, Any)): Any = {
    tuple match {
      case (`term`, _, _) => "First"
      case (_, `term`, _) => "Second"
      case (_, _, `term`) => "Third"
      case _ => "None"
    }
  }

}
