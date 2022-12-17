/*
 * Scally wants to output a set of numeric data in a fancy way by printing it with bars made of hash # symbols.
 * In this format, 5 will be printed as #####. She started the program: can you finish it?
 * Note that we can print non-negative numbers only.
 */
object Plotter extends App {
  val input = scala.io.StdIn.readLine()
  val digits = input.split(' ').map(s => s.toInt).filter(num => num >= 0)
  def buildLine(length: Int, line: String): String =
    if (length == 0) " " else line * length
  val output = digits.map(digit => buildLine(digit, "#"))
  println(output.mkString("\n"))
}