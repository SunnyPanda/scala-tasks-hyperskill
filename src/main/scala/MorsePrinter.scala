import scala.annotation.tailrec

/*
 * Scally wants to play with Morse coding, so she started making a program for transforming numbers to dots and dashes.
 * Can you help her complete the program? Note that we can print non-negative numbers only.
 */
object MorsePrinter extends App {

  val morseDigitsUntil5 = Map(
    0 -> "_____",
    1 -> ".____",
    2 -> "..___",
    3 -> "...__",
    4 -> "...._",
    5 -> "....."
  )
  val morseDigitsAfter5 = Map(
    6 -> morseDigitsUntil5(4).reverse,
    7 -> morseDigitsUntil5(3).reverse,
    8 -> morseDigitsUntil5(2).reverse,
    9 -> morseDigitsUntil5(1).reverse,
  )
  val morseDigits = morseDigitsUntil5 ++ morseDigitsAfter5

  val input = scala.io.StdIn.readLine()
  @tailrec
  def build(source: String, result: List[String]): List[String] =
    if (source.nonEmpty) {
      val current = morseDigits((source.head - '0') % 10)
      build(source.tail, result :+ current)
    } else
      result
  println(build(input, List.empty[String]).mkString)
}