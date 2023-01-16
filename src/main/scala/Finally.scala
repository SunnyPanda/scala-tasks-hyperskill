/*
 * There is a function in the scope that divides 10 by the passed number.
 * def divide10(n: Int): Int = 10 / n
 * Complete the code of the protectedDivide so that both in case of an error and in case of a successful division,
 * the function prints: "The function has ended".
 */
object Finally {
  def divide10(n: Int): Int = 10 / n
  def protectedDivide(n: Int): Int =
    try {
      divide10(n)
    } catch {
      case _: Exception => 0
    } finally {
      println("The function has ended")
    }
}