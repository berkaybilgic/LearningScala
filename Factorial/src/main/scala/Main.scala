import scala.annotation.tailrec

object Main extends App {

  def factorial(number: Int): Int = {
    @tailrec
    def fact(number: Int, acc: Int): Int = {
      number match {
        case 0 => acc
        case n => fact(n - 1, n * acc)
      }
    }
    fact(number, 1)
  }

  print(factorial(0))
}
