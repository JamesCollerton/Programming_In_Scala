object ForLoops {

	def main(args: Array[String]): Unit = {
		
		val listOne = List("One", "Two", "Three")

		// Basic generator expression
		for(li <- listOne) println(li)

		println()

		// With filter
		for(li <- listOne if(li == "One")) println(li)

		// With yield
		val listTwo = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
		val listThree = listTwo

		val divisors = for {
			liTwo <- listTwo
			liThree <- listThree if liTwo != liThree
			d <- Some(liTwo % liThree)
		} yield d

		for (div <- divisors.distinct) println(div)

		println()

		// Defining variables in the loop
		val upperCaseOne = for {
			li <- listOne
			upperCase = li.toUpperCase()
			ret <- upperCase match {
					case "ONE" => Some(upperCase)
					case _ => None
				}
		} yield ret

		upperCaseOne.foreach(println)

	}

}
