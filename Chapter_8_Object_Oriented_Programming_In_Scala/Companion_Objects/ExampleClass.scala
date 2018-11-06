case class ExampleClass(name: String) {

	def printName(): Unit = {
		print(ExampleClass.namePrintPrefix + name)
	}

}

object ExampleClass {

	val namePrintPrefix = "The name is "

}
