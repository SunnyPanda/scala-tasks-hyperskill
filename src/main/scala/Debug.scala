object Debug {
  implicit def conversion(in: (Int, String)): String = s"${in._2}:${in._1}"
}
