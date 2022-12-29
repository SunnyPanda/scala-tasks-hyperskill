/*
 * There is a hidden passport number in our Person class.
 * Write a method passportLastDigits that will return only the last 4 digits of the passport number.
 */
class Person(val name: String, val surname: String, private val passportNumber: String) {
  def passportLastDigits: String = passportNumber.substring(passportNumber.length - 4)
}
