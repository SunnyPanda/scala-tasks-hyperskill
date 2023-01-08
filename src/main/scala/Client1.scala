object Client1 {
  def logClientEvent(event: String)(implicit name: String, age: Int, id: Long): Unit =
    println(s"client: $name, age: $age, id: $id - $event")
}
