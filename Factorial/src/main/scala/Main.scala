object Main extends App {

  def factorial(number :Int) : Int = {
     number match {
      case 0 => 1
      case n => n * factorial(n-1)
    }
  }
  print(factorial(6))


}
