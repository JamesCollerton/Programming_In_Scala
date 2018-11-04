package chapterthree.subtyping

object ExampleRunner {
  def run[R <: {def run: String}](r: R): String = r.run
}
