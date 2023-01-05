/*
 * Write the class Fraction, which has two fields: numerator and denominator, and methods with the following signature:
 * def summation(other: Fraction): Fraction
 * This method should calculate the summation of two Fractions.
 */
class Fraction(val numerator: Int, val denominator: Int) {
  def summation(other: Fraction): Fraction =
    new Fraction(numerator * other.denominator + other.numerator * denominator, denominator * other.denominator)
}
