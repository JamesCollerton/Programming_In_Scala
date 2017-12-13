object PartialFunctions {

	def main(args: Array[String]): Unit = {
		definingPartialFunctions();	
	}

	def definingPartialFunctions(): Unit = {
	
		// Note: isDefinedAt is a special function	
		val divide = new PartialFunction[Int, Int] {
			def apply(divisor: Int): Int = 42 / divisor
			def isDefinedAt(divisor: Int): Boolean = if(divisor == 0) false else true 
		}

		

	}

} 
