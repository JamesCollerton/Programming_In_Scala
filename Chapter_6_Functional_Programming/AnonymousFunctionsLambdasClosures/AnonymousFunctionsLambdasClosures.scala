object AnonymousFunctionsLambdasClosures {

	def main(args: Array[String]): Unit = {
		println(m1(m2))
	}

	def m1(multiplier: Int => Int): Int = {
		(1 to 10).map(multiplier).reduce(_ * _)
	}

	def m2: Int => Int = {
		val factor = 1;
		(i: Int) => i * factor
	}

}
