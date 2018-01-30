trait Logging {
	def info(information: String): Unit = { println(s"$information") }
}
