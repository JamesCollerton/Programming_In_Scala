package chapterthree.mixins

trait Logging[A] {
  val infoString = (m: String) => s"INFO: $m"
  val warningString = (m: String) => s"WARNING: $m"
  val errorString = (m: String) => s"ERROR: $m"

  def info(message: String): A
  def warning(message: String): A
  def error(message: String): A
}
