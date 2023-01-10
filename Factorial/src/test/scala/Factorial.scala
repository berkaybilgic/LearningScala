import org.scalatest.funsuite.AnyFunSuite

class Factorial extends AnyFunSuite {

  test("Result should be factorial(0) equals 1") {
    assert(Main.factorial(0) == 1)
  }

  test("Result should be factorial(6) equals 720") {
    assert(Main.factorial(6) == 720)
  }
}
