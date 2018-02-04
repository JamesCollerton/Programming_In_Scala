object Currying {

	def concatStr(a: String, b: String): String = {
		a + " " + b
	}

	def multiplyThree(a: Int, b: Int, c: Int): Int = {
		a * b * c
	}

	def main(args: Array[String]): Unit = {
		val currConcatStr = (concatStr _).curried
		val uncurrConcatStr = Function.uncurried(currConcatStr)

		println(currConcatStr("Hello")("James"))
		println(uncurrConcatStr("Hello", "James"))

		val currMultiplication = (multiplyThree _).curried
		val partMultiplication = currMultiplication(10)(_: Int)(_: Int)
		val tupledMultiplication = Function.tupled(multiplyThree _)
		val args = (2, 3, 4)
	
		println(currMultiplication(1)(2)(3))
		println(partMultiplication(2, 3))
		println(tupledMultiplication(args))
	
		val partialFunction: PartialFunction[(Int, Int), Int] = {
			case (x, y) if y != 0 => x / y
		}
		val liftedPartialFunction = partialFunction.lift

		println(liftedPartialFunction(1, 0))
	
	}

}
