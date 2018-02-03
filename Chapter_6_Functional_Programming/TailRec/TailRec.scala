object TailRec {

	def factorial(input: Int): Int = {
		factorialStep(input, input - 1)
	}

	@annotation.tailrec
	def factorialStep(result: Int, factor: Int): Int = {
		if(factor == 0) return result
		factorialStep(result * factor, factor - 1)
	}

	def main(args: Array[String]): Unit = {
		println(factorial(5))
	}

}
