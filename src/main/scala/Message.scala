/*
 * Fix the class code so that we can combine messages as follows:
 * new Message("Hello ") |+| new Message("World!") // Message("Hello World!")
 */
class Message(val text: String) {
  def |+|(other: Message): Message = new Message(text + other.text)
}
