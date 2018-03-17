class ClassA(val name: String, val age: Int) {

	def this(name: String) = this(name, ClassA.defaultAge)
	def this(age: Int) = this(ClassA.defaultName, age)
	def this() = this(ClassA.defaultName, ClassA.defaultAge)

}

object ClassA {

	def defaultAge: Int = 0
	def defaultName: String = "Default Name"

}
