package MyPackage

sealed abstract class MyAbstractClass[A <: String](value: A) {

	def print(): Unit = {
		println("Input " + value)
	}

}

class MyClass(value: String) extends MyAbstractClass[String](value: String)
