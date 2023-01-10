object FizzBuzz extends App {
  case class FizzBuzz(number1: Int, number2: Int)
  def fizzBuzz(number: Int): String = {
    val fizzBuzz = FizzBuzz(number % 3, number % 5)
    fizzBuzz match {
      case FizzBuzz(0, 0) => "FizzBuzz"
      case FizzBuzz(0, _) => "Fizz"
      case FizzBuzz(_, 0) => "Buzz"
      case _ => "Undefined"
    }
  }
  print(fizzBuzz(15))

}
