import scala.annotation.tailrec

/*
 * Imagine you're working on a program that finds the frequency of some characters in a source text.
 * We have the initial part of the program but it's missing some core points. Can you finish it?
 */
object CharactersFrequency extends App {

  val input = scala.io.StdIn.readLine()
  @tailrec
  def build(source: String, result: Map[Char, Int]): Map[Char,Int] =
    if (source.nonEmpty) {
      val c = source.head
      val freq = c -> (result.getOrElse(c, 0) + 1)
      build(source.tail, result ++ Map(freq))
    } else
      result
  println(build(input, Map.empty[Char, Int]).mkString(","))
}
