package chapterthree.mixins

import org.scalatest.FunSuite

class PrintLoggingTest extends FunSuite {

  class ConcretePrintLoggingClass extends PrintLogging

  test("Info string") {
    assert(new ConcretePrintLoggingClass().info("info") == "INFO: info")
  }

  test("Warning string") {
    assert(new ConcretePrintLoggingClass().warning("warning") == "WARNING: warning")
  }

  test("Error string") {
    assert(new ConcretePrintLoggingClass().error("error") == "ERROR: error")
  }

}
