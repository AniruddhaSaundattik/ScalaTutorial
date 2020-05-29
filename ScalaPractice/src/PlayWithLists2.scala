object PlayWithLists2 extends App {
  //below will not work as List is abstract so cannot be instantiated
  //val lst: List[Int] = new List
  val lst: List[Int] = List(1,2,3,4,5)
  //below will not work as list is immutable
 // lst(0) = 10

  //creating an empty list
  val lst2 = Nil
  println(lst2)

  //reverse a list
  println(lst.reverse)
  val newLst = 10 :: lst
  println(newLst)

  //get the first element of the list (will throw NoSuchElementException if List is empty)
  //println(lst2.head)

  //we can use headOption which is a safer way
  println(lst2.headOption)
  println(lst.headOption.get)

  //get all elements of the list except the first element
  println(lst.tail)

  //get the second element from a list
  println(lst.tail.head)

  println(lst.length)
  println(lst2.isEmpty)

  //get the biggest element in a list
  println(lst.max)

  //get the total of a list
  println(lst.sum)

  //using forEach
  lst.foreach(e => println(e))

  //multiply each item by 3
  val lstQ = List(2,4,6,8,10)
  println(lstQ.map(_*3))
}
