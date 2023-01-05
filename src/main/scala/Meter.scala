class Centimeter(val value: Int)
class Meter(val value: Int)
object Meter {
  implicit def toCentimeter(meter: Meter): Centimeter = new Centimeter(meter.value * 100)
}
