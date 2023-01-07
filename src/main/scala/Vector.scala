/*
 * Write the scalar product operator (*) for the Vector class. The following code must work:
 * new Vector(2, 6) * new Vector(5, -1) // 4.0
 */
class Vector(val x: Double, val y: Double) {
  def *(other: Vector): Double = x * other.x + y * other.y
}
