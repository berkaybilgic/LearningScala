import org.scalatest.funsuite.AnyFunSuite

class FizzBuzzTest extends AnyFunSuite{

  test("Result should be Fizz") {
    assert(FizzBuzz.fizzBuzz(3) == "Fizz")
  }

  test("Result should be Buzz") {
    assert(FizzBuzz.fizzBuzz(5) == "Buzz")
  }

  test("Result should be FizzBuzz") {
    assert(FizzBuzz.fizzBuzz(15) == "FizzBuzz")
  }
}
