/*
 * Modify the program below so that it outputs true or false depending on whether the input string is a palindrome or not.
 */

object PalindromeChecker extends App {
  val s = scala.io.StdIn.readLine()
  val onlyLowerCaseLetters = s.filter(_.isLetter).map(_.toLower)
  println(onlyLowerCaseLetters == onlyLowerCaseLetters.reverse)
}