package chapterthree.lazyval

object LazyValCallByNameComparison {

  /*
    Here the method will be executed once
   */
  def lazyVal[A](o: A): A = {
    o
    o
  }

  /*
    Here the method will be executed twice
   */
  def callByName[A](o: => A): A = {
    o
    o
  }

}
