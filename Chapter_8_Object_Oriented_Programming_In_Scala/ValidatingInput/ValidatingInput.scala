object ValidatingInput {

	def main(args: Array[String]): Unit = {

		val classAValid = ClassA("Input")
		classAValid.print()

		// Causes an invalid class exception
		//val classAInvalid = ClassA("Invalid")

	}

}
