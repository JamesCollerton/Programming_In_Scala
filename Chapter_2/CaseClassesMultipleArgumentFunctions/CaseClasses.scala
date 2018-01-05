object CaseClasses {

	def main(args: Array[String]): Unit = {

		val myClassOneA = MyClass("One")
		val myClassOneB = MyClass("One")

		println("Comparison " + (myClassOneA == myClassOneB))
		println("Value " + myClassOneA.value)

		myClassOneA.applyFunction("Other input")((x, y) => println(x + " " + y))
	}

}
