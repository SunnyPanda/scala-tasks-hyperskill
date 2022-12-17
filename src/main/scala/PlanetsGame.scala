/*
 * Scally is newbie programmer. She tries to entertain herself with some astronomy.
 * She started writing a program that prints true if the input lines are real planets of the Solar system
 * and false otherwise. Finish her program.
 */

object PlanetsGame extends App {
  val set = Set("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
  val first = scala.io.StdIn.readLine()
  val second = scala.io.StdIn.readLine()
  val third = scala.io.StdIn.readLine()
  println(set(first) && set(second) && set(third))
}
