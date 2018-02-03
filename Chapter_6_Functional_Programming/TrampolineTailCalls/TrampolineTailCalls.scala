import scala.util.control.TailCalls._

object TrampolineTailCalls {

	// This is used when we want to tail rec optimise
	// a number of functions that call each other

	def funcA(input: Int): TailRec[Int] = {
		if(input <= 0) done(input)
		tailcall(funcB(input - 1))
	}

	def funcB(input: Int): TailRec[Int] = {
		if(input <= 0) done(input)
		tailcall(funcA(input - 1))
	}

	def main(args: Array[String]): Unit = {
		funcA(10)
	}

}
