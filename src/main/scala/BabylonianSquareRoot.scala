import scala.annotation.tailrec

/*
 * Modify the program below to output square root of 207936 with help of the Babylonian method.
 */
object BabylonianSquareRoot extends App {

  @tailrec
  def sqrt(r: Int, x: Int = 100): Int = {
    if (x * x != r)
      sqrt(r, (x + r / x) / 2)
    else
      x
  }
  println(sqrt(207936))
}
