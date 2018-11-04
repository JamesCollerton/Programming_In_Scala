package chapterthree.forloopcomprehensions

object ForLoopComprehensions {

  def filterForLoop[A](list: List[A])(f: A => Boolean): List[A] = {
    for(o <- list
      if f(o)
    ) yield o
  }

  def loopMap[A, B](list: List[Option[A]])(f: A => B): List[B] = {
    for {
      // Pattern matching in for loops.
      Some(o) <- list
      transformed = f(o)
    } yield transformed
  }

}
