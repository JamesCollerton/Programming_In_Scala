class ServiceTwo extends Logging {

	def work(i: Int): Unit = {
		info("Info in")
		println(s"Service two work $i")
		info("Info out")
	}

}
