class ClassA(val value:String) {
	require(valid(value))

	def valid(input:String): Boolean = {
		if(input.equals("Invalid")) false
		else true
	}

	def print(): Unit = {
		println(value)
	}
}

object ClassA {
	def apply(value: String) = new ClassA(value)
}
