import scala.compiletime.*

object Test {

  def main(args: Array[String]): Unit = {
    println(StringContext(Seq.empty[String]:_*).code(Seq.empty[Any]:_*)) // error
  }

}
