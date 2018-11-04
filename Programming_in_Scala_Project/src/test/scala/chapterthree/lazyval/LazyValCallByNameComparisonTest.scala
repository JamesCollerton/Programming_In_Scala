package chapterthree.lazyval

import org.scalatest.FunSuite

class LazyValCallByNameComparisonTest extends FunSuite{

  test("Lazy Val count is one") {
    lazy val testClass = new ExampleLazyTestClass(0)
    assert(LazyValCallByNameComparison.lazyVal(testClass.run()) == 1)
  }

  test("Call by name count is two") {
    val testClass = new ExampleLazyTestClass(0)
    assert(LazyValCallByNameComparison.callByName(testClass.run()) == 2)
  }

}

class ExampleLazyTestClass(var runCount: Int) {
  def run(): Int = {
    runCount += 1
    runCount
  }
}
