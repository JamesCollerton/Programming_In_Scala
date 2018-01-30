object Guards {

	def main(args: Array[String]): Unit = {

		val seq = Seq(1, 2, 3, 4, 5, 6)

		seq.map(i => i match {
			case _ if i % 2 == 0 	=> "Even"
			case _ 			=> "Odd"
		}).foreach(println)

	}

}
