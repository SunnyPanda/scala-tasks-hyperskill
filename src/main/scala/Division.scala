object Division {
  def protectedDivide(n: Int): Int =
    try {
      divide10(n)
    } catch {
      case _: Exception => 0
    }
}