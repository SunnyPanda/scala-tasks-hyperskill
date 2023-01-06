class Person1(val name: String, val age: Int)

object Person1 {
  def apply(name: String, age: Int): Person1 = new Person1(name, age)
}
