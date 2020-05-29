object MapMethod extends App  {
  val lst = List(1,2,3,4,5)
  //double all elements of a list
  val doubledList = lst.map(e => e * 2)
  println(doubledList)

  val myMap2 = Map(1 ->"abc" , 2 -> "xyz", 2 -> "def")
  println(myMap2.values.map(v => "hi " + v))
  myMap2.map(a=> println(a._1,a._2))

  val str = "hello"
  println(str.map(_.toUpper))
}
