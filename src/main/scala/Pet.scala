abstract class Pet(val name: String, breed: String) {
  def getFullName: String = s"$name it's breed is $breed"
}
