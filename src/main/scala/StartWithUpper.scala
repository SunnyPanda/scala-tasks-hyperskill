/*
 * Scally wrote a program to make the first letter of the input string upper case and print the result.
 * But the program failed with some specific cases (like empty input string).
 * Correct the program with exhaustive matching in mind.
 */
object StartWithUpper extends App {

  scala.io.StdIn.readLine() match {
    case s if s.isEmpty => ""
    case s => println(s.head.toUpper + s.drop(1))
  }
}