object MatchingSequences {

	def main(args: Array[String]): Unit = {
		val seq = Seq(1, 2, 3, 4, 5)
		println(printSeq(seq))
	}

	def printSeq[A](seq: Seq[A]): String = {
		seq match {
			case head +: tail => head + " " + printSeq(tail)
			case Nil => "Nil"
		}
	}

}
