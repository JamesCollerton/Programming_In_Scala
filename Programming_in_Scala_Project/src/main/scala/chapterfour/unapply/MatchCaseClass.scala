package chapterfour.unapply

object MatchCaseClass {

  def matchCaseClass(term: String, exampleCaseClass: ExampleCaseClass): String = {
    exampleCaseClass match {
      case ExampleCaseClassCompanionObject(`term`, _) => "First"
      case ExampleCaseClassCompanionObject(_, `term`) => "Second"
      case ExampleCaseClassCompanionObject(_, _) => "None"
    }
  }

}
