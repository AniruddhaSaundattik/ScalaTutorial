object CurryingPartialFunctionEx extends App {
  def add(x: Int)( y:Int = 5)  = x + y
  val add1 = add(10)(_)
  val result = add1(20)
  println(result)
}
