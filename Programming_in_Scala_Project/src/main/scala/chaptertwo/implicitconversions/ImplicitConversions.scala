package chaptertwo.implicitconversions

object ImplicitConversions {

  def joiner(strs: List[String]): String = joiner(strs:_*)

  def joiner(strs: String*): String = strs.mkString(" ")


}
