object CallByValueAndLazy {
	
	var a = 0

	def main(args: Array[String]): Unit = {
		
		lazy val lazyVal = lazyValue() 		

		callByValueFunction(callByValue)
		
		println(lazyVal)

		println("Hello, world")
	}

	def callByValueFunction(input: => Int): Unit = {
		println(input)
		println(input)
		println(input)
	}

	def callByValue(): Int = {
		a += 1
		a
	}
	
	def lazyValue(): Int = {
		a += 1
		a
	}
}
