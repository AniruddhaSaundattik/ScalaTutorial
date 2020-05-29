object Clousers extends App {
  //impure closure
  var x = 10
  def add(a: Int, b: Int) = {
    a + b + x
  }
  println(add(10,20))
  //pure closure
  val y = 20
  def add2(a: Int, b: Int) = {
    a + b + y
  }
  println(add2(10,20))
}
