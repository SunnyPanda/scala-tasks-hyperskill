import scala.annotation.tailrec

/*
 * Scally started a project to test if the input natural number is a prime number.
 * Help her finish the program using the pattern matching technique.
 */
object PrimalityTest extends App {

  @tailrec
  def isPrime(input: Int, n: Int = 2): Boolean =
    input match {
      case x if x < 2 => false
      case x if n * n > x => true
      case x if x % n == 0 => false
      case _ => isPrime(input, n + 1)
    }

  val input = scala.io.StdIn.readLine().toInt
  println(isPrime(input))
}
