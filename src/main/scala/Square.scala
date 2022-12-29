/* Write a class Square. It must have a constructor that takes only one value (because the sides of a square are equal).
 * Write the calculateArea and calculatePerimeter methods that will calculate Area and Perimeter
 */
class Square(side: Int) {
  def calculateArea: Int = side * side

  def calculatePerimeter: Int = side * 4
}
