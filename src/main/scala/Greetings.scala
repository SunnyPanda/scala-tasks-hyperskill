/*
 * Modify the program below to output greetings for the user with the name received by input.
 * Note that the mkString method concatenates all list elements to a string with the separator as an argument.
 */

object Greetings extends App {
  val name = scala.io.StdIn.readLine()
  val list = "Hello, " :: name :: "!" :: Nil
  println(list.mkString(""))
}
