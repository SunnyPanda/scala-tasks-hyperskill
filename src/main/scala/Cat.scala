/*
 * Change the code to turn showInfo into a class method.
 */
class Cat(val name: String, val age: Int, val breed: String) {
  def showInfo(): String =
    s"""Your Cat information:
       |Name: $name
       |Age: $age
       |Breed: $breed""".stripMargin
}