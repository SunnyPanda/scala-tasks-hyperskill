/*
Scally is writing a program that outputs words in a sentence in the reverse order:
it transforms high blue skies to skies blue high. It is expected that the words contain only letters and
are separated by space. Help Scally finish the program!
*/

object WordsReverser extends App {
  val s = scala.io.StdIn.readLine()
  val result = s.reverse.split(' ').map(w => w.reverse).mkString(" ")
  println(result)
}