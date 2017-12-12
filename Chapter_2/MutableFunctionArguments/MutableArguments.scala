object MutableArguments {
	
	def main(args: Array[String]): Unit = {
		val myClass = new MyClass("Mutable", "Immutable")
		println("" + myClass.immutableValue)
		println("" + myClass.mutableValue)
		myClass.mutableValue = "New value"
		println("" + myClass.mutableValue)
	}

}
