sealed trait DecodeResult

object DecodeResult {
  case class Failure(error: String) extends DecodeResult
  case class Success(json: Json) extends DecodeResult
}
