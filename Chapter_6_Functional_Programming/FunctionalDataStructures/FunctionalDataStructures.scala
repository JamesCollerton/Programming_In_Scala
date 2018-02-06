object FunctionalDataStructures {

	def main(args: Array[String]): Unit = {
		listExamples()
		seqExamples()
		flatMapExamples()
	}

	def listExamples(): Unit = {

		val listOne = List("Programming", "in", "Scala")
		val listTwo = "People" :: "should" :: "read" :: listOne
		val listThree = "This" :: "is" :: "a" :: "list" :: Nil
		val listFour = listOne ++ listTwo
		val listFive = listOne ::: listThree

		println()
		listFive.foreach(x => print(x + " "))

	}

	def seqExamples(): Unit = {
		
		val seqOne = Seq(1, 2, 3)
		val seqTwo = 3 +: 4 +: 5 +: Seq.empty
		val seqThree = seqOne ++ seqTwo

		println()
		println()
		seqThree.foreach(println)

	}

	def flatMapExamples(): Unit = {

		val listInner = List("One", "Two", "Three")
		val listOuter = List(listInner, listInner, listInner)

		println()
		listOuter.flatten.foreach(println)
		println()
		listInner.flatMap(List.fill(3)(_)).foreach(println)

	}

}
