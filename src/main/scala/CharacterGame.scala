/*
 * We introduced a new game: the user enters a character, its INT representation and a boolean marking
 * if this character is upper case or not. The program checks if the input is correct. Finish the program!
 */
object CharacterGame extends App {

  private val triple = (
    scala.io.StdIn.readChar(),
    scala.io.StdIn.readInt(),
    scala.io.StdIn.readBoolean()
  )
  private val expected = (
    triple._1,
    triple._1.toInt,
    triple._1.isUpper
  )
  println(triple == expected)
}