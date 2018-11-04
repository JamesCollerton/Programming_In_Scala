package chapterthree.bindingdirections

object BindingDirection {
  def bindRight(ints: List[Int], i: Int) = ints :+ i
  def bindLeft(i: Int, ints: List[Int]) = i +: ints
}
