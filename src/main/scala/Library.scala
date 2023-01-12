class Library {
  def tryPrintSpecialNumber(s: String): Unit = {
    try {
      println(parseSpecialNumber(s))
    } catch {
      case ex: Exception => println(ex.getMessage)
    }
  }
}
