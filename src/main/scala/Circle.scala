/*
 * Correct the program below so that it passes correct arguments to functions.
 */
object Circle extends App {
  val pi = 3.14159
  val radius = 5

  def square(pi: Double, radius: Int): Double = pi * radius * radius

  def circumference(diameter: Int, pi: Double): Double = pi * diameter

  println(square(pi, radius))
  println(circumference(2 * radius, pi))
}