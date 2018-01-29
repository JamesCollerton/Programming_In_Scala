object Traits {

	def main(args: Array[String]) : Unit = {

		val service = new Service() with Logging {
			override def work(i: Int): Unit = {
				info("Info in")
				super.work(i)
				info("Info out")
			}
		}

		(1 to 3).foreach(service.work(_))

	}

}
