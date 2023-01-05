
trait Talkative {
  def talk: String
}

class Human(name: String) extends Talkative {
  override def talk: String =  s"Hello, I'm $name"
}
