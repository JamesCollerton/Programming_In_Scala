object FoldReduce {

	def main(args: Array[String]): Unit = {
		reduceExample()
	}

	def reduceExample(): Unit = {
		val list = List(1, 2, 3, 4, 5, 6)
		println(list.reduce(_ + _))
		println(list.fold(10)(_ * _))
		println(foldL(list.head, list.tail)(_ + _))

		val listTwo = List(1, 2, 6)
		// 6 - (2 - 1)
		println(listTwo.reduceRight(_ - _))
		println(foldR(listTwo)(_ - _))
	}

	@annotation.tailrec
	def foldL[A](value: A, seq: Seq[A])(f: (A, A) => A): A = seq match {
		case head +: tail => foldL(f(value, head), tail)(f)
		case _ => value
	}
	
	def foldR[A](seq: Seq[A])(f: (A, A) => A): A = seq match {
		case head +: tail if tail != Seq.empty[A] => f(head, foldR(tail)(f))
		case head +: tail if tail == Seq.empty[A] => head 
	}

}
