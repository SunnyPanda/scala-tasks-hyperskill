/*
 * Modify the program below to output the statistics of the input text line:
 * the number of characters, unique characters, and words.
 */

object TextReportPrinter extends App {

  val textLine = scala.io.StdIn.readLine()
  println(
    s"""characters: ${textLine.length}
       |unique characters: ${textLine.toSet.size}
       |words: ${if (textLine.isEmpty) 0 else textLine.split("\\s").length}
       |""".stripMargin)
}
