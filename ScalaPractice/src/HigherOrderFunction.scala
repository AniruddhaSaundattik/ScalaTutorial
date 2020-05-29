object HigherOrderFunction extends App {
  def add(x: Int, y: Int, f:(Int,Int) => Int) : Int = f(x,y)
  val result = add(10,30, (i,j) => i + j)
  println(result)

  def add2(x: Int, y: Int, z: Int, f:(Int,Int) => Int): Int = f(f(x,y),z)
  println(add2(10, 30, 40, (x,y) => x + y))

  def higherFunc(f:(Double)=>String ,double: Double) = f(double)

  println(higherFunc((d)=>d.toString,20))
 }
