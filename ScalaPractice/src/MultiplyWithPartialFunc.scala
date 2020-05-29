object MultiplyWithPartialFunc extends App {
  def multiplication(x:Int, y: Int, z: Int) = x * y * z
  val interMult = multiplication(10, _ , _)
  val interMult2 = interMult(2, _)
  val finalResult = interMult2(3)
  println(finalResult)
}
