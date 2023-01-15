/*
 * Implement two operators: * and *: for the Point class. The * method takes the right operand an integer number and
 * multiplies each coordinate of the Point class by this number. The method *: does the same but takes the left operand.
 * Make sure that the following code compiles:
 * 3 *: new Point(1, 2, 3) // Point(3, 6, 9)
 * new Point(1, 2, 3) * 3 // Point(3, 6, 9)
 */
class Point(val x: Int, val y: Int, val z: Int) {
  private def *(n: Int): Point = new Point(x * n, y * n, z * n)
  def *:(n: Int): Point = new Point(x, y, z) * n
}