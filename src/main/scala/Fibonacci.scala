/*
 * Modify a program below to output the first 5 Fibonacci numbers, each on a new line.
 */
object Fibonacci extends App {
  val a = 0
  val b = 1
  def sum(a: Int, b: Int): Int = a + b

  println(a)
  println(b)
  println(sum(a, b))
  println(sum(sum(a, b), b))
  println(sum(sum(sum(a, b), b), sum(a, b)))
}
