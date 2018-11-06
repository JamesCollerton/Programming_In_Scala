object Constructors {

	def main(args: Array[String]): Unit = {
		println("Hello, world");

		val classA = new ClassA();
		println(classA.name + ", " + classA.age)

		val classB = new ClassB();
		println(classB.name + ", " + classB.age + ", " + classB.weight);

		val classC = new ClassC(10);
		println(classC.value)
		
		// Causes an error as just used for initialisation
		//println(classC.seed)
	}

}
