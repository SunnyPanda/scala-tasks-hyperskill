object Ip {
  implicit def conversion(in: (Int, Int, Int, Int)): String = s"ip:${in._1}.${in._2}.${in._3}.${in._4}"
}
