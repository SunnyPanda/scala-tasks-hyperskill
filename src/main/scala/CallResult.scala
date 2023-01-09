sealed trait CallResult[+A]
object CallResult {
  case object Timeout                extends CallResult[Nothing]
  case class Error(cause: Throwable) extends CallResult[Nothing]
  case class Result[A](value: A)     extends CallResult[A]
}

sealed trait User
object User {
  case class LegacyUser(id: Long, nickname: String)                 extends User
  case class LoggedUser(id: Long, login: String, sessionId: String) extends User
}

abstract class Main {
  def getUserFromDatabase(id: Long): CallResult[User]

  def getLegacyUser(id: Long): User.LegacyUser = getUserFromDatabase(id) match {
    case CallResult.Result(result) => result match {
      case x: User.LoggedUser => User.LegacyUser(id, x.login)
      case x: User.LegacyUser => x
    }
    case _ => getLegacyUser(id)
  }
}

