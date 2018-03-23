object ParentTypesUsingTraits {

	def main(args: Array[String]): Unit = {
		val classB = new ClassB("Name", 12, 13);

		List(classB.name, classB.weight, classB.age).foreach(println)

		val classA = new ClassA("Other name", 0)
		
		List(classA.name, classA.age).foreach(println)
	}

}
