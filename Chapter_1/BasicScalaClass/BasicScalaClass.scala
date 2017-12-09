object BasicScalaClass {

	class Upper {

		def toUpper(args: String*): String = {
			args.map(_.toUpperCase()).mkString(" ")
		}

	}	

	def main(args: Array[String]) {
		val upper = new Upper
		println(upper.toUpper("Hello", "world"))
	}

}
