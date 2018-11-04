package chapterthree.operatoroverloading

object IsEven {
  private def isEven(n: Int): Boolean = (n % 2) == 0
  // Equivalent to ints.filter(isEven). Not really sure why this works
  // I kind of feel it should be ints.filter.isEven. Potentially if we
  // are expecting an argument it uses the next thing.
  def apply(ints: List[Int]): List[Int] = ints filter isEven
}
