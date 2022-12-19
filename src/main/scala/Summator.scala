/*
 * Robot wants to emulate simple calculation of expressions: first, it defines variables, and then adds them up.
 * With a limited amount of resources, Robot has a bunch of special conditions.
 * It can work with definitions like a=5,b=10 so that in one input line, each definition contains
 * a string name of a variable, an equals sign, and an integer value. It is possible to define several variables
 * with a comma as a separator. The calculated sum expression is defined in the next input string
 * in the format a+b with the names of variables separated by a plus sign. It is allowed to use undefined
 * variable names in the expression: in this case, the value of the variable will be 0.
 * Help Robot finish the program!
 */
object Summator extends App {
  val inputDefinitions = scala.io.StdIn.readLine()
  val inputExpression = scala.io.StdIn.readLine()
  var variables = Map.empty[String, Int]
  inputDefinitions
    .split(',')
    .filter(_.nonEmpty)
    .map { _.split('=') }
    .foreach { array => variables += (array.head -> array.last.toInt) }
  println(inputExpression.split('+').map(variable => variables.getOrElse(variable, 0)).sum)
}