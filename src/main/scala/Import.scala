import scala.collection.mutable
import scala.math._
//import scala.math.min
import scala.math.{E => EulerNumber}

class Import

object MyWorld {
  import scala.collection.mutable
  val animals: mutable.Seq[String] = mutable.Seq("cat", "dog", "frog")
}

object AnotherWorld {
  val birds: mutable.Seq[String] = mutable.Seq("pigeon", "flamingo")
}

def minOf3(n1: Int, n2: Int, n3: Int): Int =
  min(min(n1, n2), n3)