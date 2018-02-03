object PartialAppliedFunction {

	def concatStr(a: String)(b: String): String = {
		a + " " +  b
	}

	val partialFunction: PartialFunction[(Int, Int), Int] = {
		case (x, y) if y != 0 => x / y
	}

	def main(args: Array[String]): Unit = {

		val hello = concatStr("Hello")_
		println(hello("James"))

		println(partialFunction(4, 2))
		

	}

}
