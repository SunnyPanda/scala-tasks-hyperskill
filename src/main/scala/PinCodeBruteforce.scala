/*
 * Scally's phone has a pin code. She calculated its hash but lost the code itself.
 * She remembers that her pin is 4 digits, though. Help Scally finish program that iterates over the options
 * and produces the correct lost code.
 */
object PinCodeBruteforce extends App {
  val pinCodeHash = 1537215
  var candidate: Int = 0

  def asPinCode(i: Int): String = f"$i%04d"

  while (asPinCode(candidate).hashCode != pinCodeHash) {
    candidate += 1
  }
  println(asPinCode(candidate))
}