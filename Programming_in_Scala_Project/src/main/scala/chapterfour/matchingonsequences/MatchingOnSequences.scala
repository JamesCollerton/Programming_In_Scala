package chapterfour.matchingonsequences

object MatchingOnSequences {

  def matchOnTerm[A](term: A, list: List[A]): Option[String] = {
    list match {
      case head +: tail if head == term => Option(tail.mkString(", "))
      case head +: tail => matchOnTerm(term, tail)
      case Nil => Option.empty
    }
  }

}
