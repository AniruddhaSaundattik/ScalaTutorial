object PlayWithTuples extends App {
  val tpl = new Tuple3[String,Int,Int]("str1",1,3)
  //accessing elements in a tuple
  println("The first element is " + tpl._1)

  //iterating in a tuple foreach is accessible through productIterator
  tpl.productIterator.foreach(u => println(u))



}
