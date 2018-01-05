case class MyClass(val value: String) {

	def applyFunction(inputOne: String)(f: (String, String) => Unit): Unit = {
		f(inputOne, value)
	} 

}
