/** An array of 1024 bytes corresponding to one block of 
*   data in our heap
*
*   @constructor initialises the array to empty
*/
class DataBlock {

	/** The data block of 1024 bytes */
	val dataBlock = new Array[Byte](1024)

	/** Used to write data to the data block
	*
	*   @param data the data to be written to the block
	*   @return a boolean to say if the write was successful
	*/
	def write(data: Array[Byte]): Boolean = ???

	/** Used to read the data from the data block
	*   
	*   @return the array of data from the block
	*/
	def read(): Array[Byte] = ???
	
}
