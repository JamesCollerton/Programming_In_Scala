package chapterthree.mixins

trait PrintLogging extends Logging[String] {
  override def info(message: String): String = infoString(message)

  override def warning(message: String): String = warningString(message)

  override def error(message: String): String = errorString(message)
}
