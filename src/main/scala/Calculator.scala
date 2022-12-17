/*
 * The aliens decided to send humans a basic calculator and chose Scala as the source language.
 * The calculator should only add or subtract two natural numbers in the form of first operation second.
 * The program should output the result of the calculation. If the format of the input doesn't match
 * the defined format of the program, the Unsupported expression should be printed.
 * During transmission, the alien program was corrupted. Try to recover the missing parts.
 */
object Calculator extends App {

  val input = scala.io.StdIn.readLine().split(' ').toList
  input match {
    case a :: "+" :: b :: Nil if a.forall(_.isDigit) && b.forall(_.isDigit) =>
      println(a.toInt + b.toInt)
    case a :: "-" :: b :: Nil if a.forall(_.isDigit) && b.forall(_.isDigit) =>
      println(a.toInt - b.toInt)
    case _ => println("Unsupported expression")
  }
}
