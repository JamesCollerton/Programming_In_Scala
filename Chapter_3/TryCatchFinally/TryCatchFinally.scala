import scala.io.Source
import scala.util.control.NonFatal

object TryCatchFinally {

	def main(args: Array[String]): Unit = {
		countLines("Input/Input.txt")
		countLines("DoesNotExist")
	}

	def countLines(fileName: String): Unit = {
		println()
		var source: Option[Source] = None

		try {
			source = Some(Source.fromFile(fileName))
			println("" + source.get.getLines.size)
		} catch {
			case NonFatal(ex) => println("Exception")
		} finally {
			println("Closing")
			if(source != None) source.get.close()
		}

	}

}
