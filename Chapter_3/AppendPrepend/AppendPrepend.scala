object AppendPrepend {

	def main(args: Array[String]): Unit = {
		
		val listOne = List(1, 2, 3)

		// Here the double colon is a constructor
		// for the list, a is the head, listOne is
		// the tail
		val listTwo = "a" :: listOne

		// This creates a copy of the list but with
		// b prepended.
		val listThree = "b" +: listOne :+ "c"
		listTwo.foreach(println)
		println()
		listThree.foreach(println)
		println()

		// If the method name ends in a colon, the 
		// method is invoked on the right operand.
		val listFour = listOne ++: List("d")
		listFour.foreach(println)
		
	}

}
