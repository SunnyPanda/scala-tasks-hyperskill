import scala.annotation.tailrec

/*
 * Modify the program below to output the first 20 Fibonacci numbers, each on a new line.
 */
object Fibonacci2 extends App {

  @tailrec
  def printNumber(first: Int, second: Int, count: Int): Unit =
    if (count > 0) {
      println(first)
      printNumber(second, first + second, count - 1)
    }

  printNumber(0, 1, 20)
}