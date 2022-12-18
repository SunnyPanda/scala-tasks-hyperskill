import scala.io.StdIn._

/*
 * Write a program that first reads the user's name as a string, then reads the user's age as a number,
 * and then their favorite movie. In the end, the program should output "Hi, name, your age is age,
 * your favorite movie is favorite movie".
 */
object Greetings2 {
  def main(args: Array[String]): Unit = {
    val name = readLine()
    val age = readInt()
    val movie = readLine()

    println(s"Hi, $name, your age is $age, your favorite movie is $movie")
  }
}
