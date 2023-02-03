import scala.math.{E, Pi}

object Math extends App {
  val pi = BigDecimal(Pi).setScale(2, BigDecimal.RoundingMode.FLOOR).toDouble
  val e = BigDecimal(E).setScale(2, BigDecimal.RoundingMode.FLOOR).toDouble
}
