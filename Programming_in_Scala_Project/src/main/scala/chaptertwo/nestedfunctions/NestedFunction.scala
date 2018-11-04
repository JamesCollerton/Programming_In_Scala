package chaptertwo.nestedfunctions

object NestedFunction {

  def factorial(i: Integer): Integer = {

    def loop(i: Integer): Integer = {
      if (i <= 0) 1 else i * loop(i - 1)
    }

    loop(i)
  }

}
