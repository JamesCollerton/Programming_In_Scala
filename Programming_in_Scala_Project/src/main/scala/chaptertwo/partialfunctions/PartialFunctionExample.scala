package chaptertwo.partialfunctions

object PartialFunctionExample {

  val partialFunctionString: PartialFunction[Any, String] = { case s: String => "String" }

  val partialFunctionInteger: PartialFunction[Any, String] = { case i: Integer => "Integer" }

  val partialFunctionStringInteger: PartialFunction[Any, String] = partialFunctionString orElse partialFunctionInteger

}
