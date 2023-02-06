/* Imagine we have the following conversions:

implicit def clientDataToMessage(in: (Long, String)): String =
  s"client-id: ${in._1}, client-name: ${in._2}"

implicit def clientIdToMessage(in: Long): String =
  s"client-id: $in, client-name: undefined"
Fix the log function so that it can be called as follows:

implicit val applicationId: Long = 42L

Logging.log((143213L, "Max"))
Logging.log(143213L)
In this case, the console must print:

id:42 -> client-id: 143213, client-name: Max
id:42 -> client-id: 143213, client-name: undefined
 */

object Logging {
  def log(message: String)(implicit id: Long): Unit =
    println(s"id:$id -> $message")
}
