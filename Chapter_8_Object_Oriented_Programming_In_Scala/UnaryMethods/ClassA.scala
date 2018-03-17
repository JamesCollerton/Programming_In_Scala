case class ClassA(val value: Int) {
	def unary_- : ClassA = ClassA(-value)
	def -(other: ClassA): ClassA = ClassA(value - other.value)
}
