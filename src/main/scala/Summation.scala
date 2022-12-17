import scala.io.StdIn.readInt

/*
 * Write a program that reads 2 numbers from the console and displays their sum.
 */

object Summation {
  def main(args: Array[String]): Unit = {
    val first = readInt()
    val second = readInt()
    print(first + second)
  }
}