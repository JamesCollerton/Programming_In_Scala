object UnaryMethods {

	def main(args: Array[String]): Unit = {
		val classA10 = ClassA(10)
		val classA20 = ClassA(20)
		
		val classAMinus10 = -classA10
		val classAMinus10Again = classA10 - classA20

		List(classAMinus10, classAMinus10Again).foreach(x => println(x.value))
	}

}
