sealed trait OptionalString

object OptionalString {
  case class Some(login: String) extends OptionalString
  case object None extends OptionalString
}
