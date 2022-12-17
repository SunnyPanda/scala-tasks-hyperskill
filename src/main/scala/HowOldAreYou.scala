import scala.io.StdIn.readInt

/*
 * Write a program that will read the user's age and print it to the console with the line "Your age is".
 * For example, if the user's age is 18, the program should print "Your age is 18".
 */

object HowOldAreYou {
  def main(args: Array[String]): Unit = {
    println(s"Your age is ${readInt()}")
  }
}
