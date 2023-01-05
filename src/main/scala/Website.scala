class Website {
  def authorizeAdmin(password: String): Boolean = Website.adminPassword == password
}

object Website {
  private val adminPassword: String = ""
  // the logic of getting the password from the configuration here
}
