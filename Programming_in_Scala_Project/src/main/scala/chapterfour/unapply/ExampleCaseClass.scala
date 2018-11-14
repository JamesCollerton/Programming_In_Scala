package chapterfour.unapply

case class ExampleCaseClass(valueOne: String, valueTwo: Int)

object ExampleCaseClassCompanionObject {

  def unapply(arg: ExampleCaseClass): Option[(String, String)] = {
    Option((arg.valueOne.toString, arg.valueTwo.toString))
  }

}