package chapterfour.bindingvariables

object MatchOnBindingVariables {

  def matchOnBindingVariables(term: String, tuple: (String, String, String)): Option[String] = {
    tuple match {
      case (p @ `term`, _, _) => Option(p)
      case (_ , p @ `term`, _) => Option(p)
      case (_, _, p @ `term`) => Option(p)
      case (_, _, _) => Option.empty
    }
  }

}
