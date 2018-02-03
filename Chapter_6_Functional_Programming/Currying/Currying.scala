object Currying {

	def concatStr(a: String, b: String): String = {
		a + " " + b
	}

	def main(args: Array[String]): Unit = {
		val currConcatStr = (concatStr _).curried
		val uncurrConcatStr = Function.uncurried(currConcatStr)

		println(currConcatStr("Hello")("James"))
		println(uncurrConcatStr("Hello", "James"))
	}

}
