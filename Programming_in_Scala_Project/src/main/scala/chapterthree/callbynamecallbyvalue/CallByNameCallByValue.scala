package chapterthree.callbynamecallbyvalue

object CallByNameCallByValue {

  /*
    This is used in order to delay the calling until we actually use
    the object.
   */
  def callByName[A](o: => A): A = {
    o
  }

  /*
    The minute that we call the function the object is evaluated
   */
  def callByValue[A](o: A): A = {
    o
  }

}
