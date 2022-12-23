/*
 * Scally started a program that prints the type of the file by the extension of the name.
 * Finish the program below. In case the program doesn't have any information about the extension,
 * set the type to unknown.
 */
object FileTypePrinter extends App {
  val extensions = Map(
    "txt" -> "plain text",
    "scala" -> "Scala source code",
    "bin" -> "binary data"
  )

  val file = scala.io.StdIn.readLine()
  val dotIndex = file.indexOf(".")
  val extension = if (dotIndex == -1) "" else file.substring(dotIndex + 1).toLowerCase
  println(s"File $file type is ${extensions.getOrElse(extension, "unknown")}")
}