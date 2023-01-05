trait Phone {
  def serialNumber: String
}

object Phone {
  // Stable
  private class PhoneX extends Phone {
    val serialNumber: String = "X100P20"
  }
  // Experimental
  private class PhoneY extends Phone {
    val serialNumber: String = "Y100P42"
  }

  def getStableModel: Phone = new PhoneX()
  def getExperimentalModel: Phone = new PhoneY
}
