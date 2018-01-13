/** Heap
*   
*   Contains 100,000 data blocks and the allocate method 
*   to write to the data blocks.
*/
object Heap {

	/** The heap array of 100,000 data blocks to be allocated to */
	val heap = new Array[DataBlock](100000)

	def main(args: Array[String]): Unit = {
		println("Hello world")
	}

	/** Allocates a number of data blocks
	*
	*   @param numBlocksRequired the number of data blocks required
	*   @return The first data block
	*/
	def allocate(numBlocksRequired: Int): DataBlock = ???

}
