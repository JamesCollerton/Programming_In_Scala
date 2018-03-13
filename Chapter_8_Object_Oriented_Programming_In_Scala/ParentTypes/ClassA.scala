abstract class AbstractClassA {

	type AbstractType 
	val value: AbstractType

	def function: Unit

}

class ClassA(val value: String) extends AbstractClassA {

	type AbstractType = String

	@Override
	def function: Unit = println(value)

}
