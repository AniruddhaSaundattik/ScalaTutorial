import java.util.Date

object PartiallyAppliedFunction extends App {

  def sub(x: Int, y: Int) : Int = x - y
  // function is partially applied here..
  val diff = sub(20, _)
  println(diff)
  println(diff(10))

  def divide(x: Double, y: Double): Double = x / y
  val halfOf = divide(_, 2)
  println(halfOf(20))

  def log(date: Date, msg: String ): Unit = println(date,msg)
  val logger = log(new Date(), _)
  logger("Using Partially Applied Function")
}
