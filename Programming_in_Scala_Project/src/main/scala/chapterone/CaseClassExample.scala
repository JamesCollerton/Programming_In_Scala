package chapterone

case class CaseClassExample(value: String)

object CaseClassExample {

  def apply(overridenValue: String): CaseClassExample = {
    new CaseClassExample("Object value")
  }

}