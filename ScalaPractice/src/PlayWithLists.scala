object PlayWithLists extends App {
  val lst = List(1,2,3,4,5)
  val lst2 = (1,2,3,4,5)
  val lst3 = List(1,"2","3", true)

  println(lst)
  println("Second List")
  println(lst2.isInstanceOf[Tuple5[Int,Int,Int,Int,Int]])
  println(lst2.getClass)
  println(lst3.isInstanceOf[List[Any]])
}
