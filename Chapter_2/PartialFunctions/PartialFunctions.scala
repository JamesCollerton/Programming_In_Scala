object PartialFunctions {

	def main(args: Array[String]): Unit = {
		definingPartialFunctions();	
	}

	def definingPartialFunctions(): Unit = {
	
		// Note: isDefinedAt is a special function	
		// So a partial function is defined as a function that takes in
		// arguments, then can be undefined at an argument, even though 
		// it is a valid input.
		val divide = new PartialFunction[Int, Int] {
			def apply(divisor: Int): Int = 42 / divisor
			def isDefinedAt(divisor: Int): Boolean = if(divisor == 0) false else true 
		}

		val divideInputError = new PartialFunction[Int, String] {
			def apply(divisor: Int): String = "ERROR"
			def isDefinedAt(divisor: Int): Boolean = if(divisor == 0) true else false 
		}

		val completeFn = divide orElse divideInputError

		println("Valid " + completeFn(10))
		println("Invalid " + completeFn(0))

	}

} 
