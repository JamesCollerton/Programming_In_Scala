object Dogs extends Enumeration {

	type Breed = Value
	val doberman 		= Value("Doberman")
	val scottishTerrier 	= Value("Scottish Terrier")
	val highLandTerrier 	= Value("Highland Terrier")

	def printValues(): Unit = {
		values.foreach(println)
	}

	def printTerriers(): Unit = {
		values.filter(_.toString.contains("Terrier")).foreach(println)
	}
}
