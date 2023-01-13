/*
 * There are two types of users on our website. These classes are already represented in the scope.
 * Write a function that will accept User and generate a greeting. If the user is not registered, you need to return
 * "Hello! Please register". If the user is already logged in, you need to greet him with the login
 * s"Hello, $login! Nice to see you again"
 */
object Register {
  def greetUser(user: User): String = user match {
    case _: User.Unregistered => "Hello! Please register"
    case x: User.Logged => s"Hello, ${x.login}! Nice to see you again"
  }
}

trait User
object User {
  case class Unregistered(ipAdress: String) extends User
  case class Logged(login: String, id: Long) extends User
}
