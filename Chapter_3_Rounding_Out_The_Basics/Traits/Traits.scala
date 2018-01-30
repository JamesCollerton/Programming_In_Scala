object Traits {

	def main(args: Array[String]) : Unit = {

		val service = new Service() with Logging {
			override def work(i: Int): Unit = {
				info("Info in")
				super.work(i)
				info("Info out")
			}
		}

		val serviceTwo = new ServiceTwo()

		(1 to 3).foreach(service.work(_))
		(1 to 3).foreach(serviceTwo.work(_))

	}

}
