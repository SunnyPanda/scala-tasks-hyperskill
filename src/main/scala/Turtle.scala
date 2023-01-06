trait Pet {
  def breath: String = "breath"
  def eat: String
}

class Turtle extends Pet {
  override def breath: String = "another breath"
  override def eat: String = "eat"
  def play: String = "play"
}
