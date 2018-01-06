sealed class SealedClass(value: String) {

	def print(): Unit = {
		println(value)
	}

}

class SealedClassSubClass(value: String) extends SealedClass(value: String) {

	override
	def print(): Unit = {
		println("Value " + value)
	}

}
