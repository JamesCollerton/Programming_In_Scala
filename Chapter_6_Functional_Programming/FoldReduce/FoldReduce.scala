object FoldReduce {

	def main(args: Array[String]): Unit = {
		reduceExample()
	}

	def reduceExample(): Unit = {
		val list = List(1, 2, 3, 4, 5, 6)
		println(list.reduce(_ + _))
		println(list.fold(10)(_ * _))
		
		val listTwo = List(1, 2, 6)
		// 6 - (2 - 1)
		println(listTwo.reduceRight(_ - _))
	}

}
