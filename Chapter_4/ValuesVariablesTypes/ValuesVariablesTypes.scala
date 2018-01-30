object ValuesVariablesTypes {

	def main(args: Array[String]): Unit = {

		val x = Seq(1, 2, "one", "two", 1.0, 2.0, false)

		x.map(_ match {
			case 1 | "one" | 1.0 	=> "Found One"
			case i: Int 	=> "Another Integer"
			case s: String 	=> "Another String"
			case f: Double 	=> "Another Double"
			case _		=> "Anything Else"
		}).foreach(println)

	}

}
