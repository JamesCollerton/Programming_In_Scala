object Constructors {

	def main(args: Array[String]): Unit = {
		println("Hello, world");

		val classA = new ClassA();
		println(classA.name + ", " + classA.age)

		val classB = new ClassB();
		println(classB.name + ", " + classB.age + ", " + classB.weight);
	}

}
