import scala.annotation.tailrec

/*
 * Finish the program that counts all the prime numbers in a range of integers until n.
 * If n<2, there will be no prime numbers.
 */
object PrimeCounter extends App {
  var list = List.empty[Int]
  @tailrec
  def count(i: Int, n: Int): Unit =
    if (i <= n) {
      val zeroModWithPrime = list.filter(prime => i % prime == 0)
      if (zeroModWithPrime.isEmpty) list = i :: list
      count(i + 1, n)
    }

  val n = scala.io.StdIn.readLine().toInt
  if (n < 2)
    println(0)
  else {
    count(2, n)
    println(list.length)
  }
}