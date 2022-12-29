/*
 * Fix the boiler class so that we can't access the degradation level and this field was used to visualize the status.
 */
class Boiler(var temperature: Double, degradationLevel: Int) {
  def status: String =
    "Temperature: " + temperature + ". Requires verification: " + (degradationLevel > 10)
}
