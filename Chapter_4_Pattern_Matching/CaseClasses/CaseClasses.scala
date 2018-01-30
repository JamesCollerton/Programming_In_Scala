object CaseClasses {

	case class Person(val name: String, val age: Int, val height: Double)

	def main(args: Array[String]): Unit = {
		
		val J = new Person("J", 20, 200)
		val S = new Person("S", 30, 300)
		val P = new Person("P", 40, 400)

		val seq = Seq(J, S, P)

		seq.map(_ match {
			case Person(_, 20, _) 	=> "20 age"
			case Person("S", _, _) 	=> "S name"
			case Person(_, _, 400) 	=> "400 height"
			case _ => "Unmatched"	
		}).foreach(println)

	}

}
