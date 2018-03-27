
import scala.quoted._
import dotty.tools.dotc.quoted.Toolbox._

object Test {

  def main(args: Array[String]): Unit = {

    def test[T](clazz: java.lang.Class[T]): Unit = {
      val lclazz = clazz.toExpr
      val name = '{ (~clazz.toExpr).getCanonicalName }
      println()
      println(name.show)
      println(name.run)
    }

    // primitive arrays
    test(classOf[Array[Boolean]])
    test(classOf[Array[Byte]])
    test(classOf[Array[Char]])
    test(classOf[Array[Short]])
    test(classOf[Array[Int]])
    test(classOf[Array[Long]])
    test(classOf[Array[Float]])
    test(classOf[Array[Double]])

    test(classOf[Array[Array[Int]]])
    test(classOf[Array[Array[Array[Int]]]])
  }

}
