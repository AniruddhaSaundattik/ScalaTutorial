object FlatMapMethod extends App{
  val lst = List(1,2,3,4,5)
  println(lst.flatMap(x => List(x,x+1)))

  val lst2 = (1 to 10).toList
  println(lst2)
  println(lst2.filter(e => e%2 ==0)) // filter takes in a predicate

  println(lst2.reduce((x,y) => x + y ))
  println(lst2.reduceLeft((x,y) => x + y)) // reduceleft is same as reduce.. takes the elements from starting of the list

  println(lst2.reduceRight((x,y) => x + y)) // reduceright picks elements from right side of the list& computes

  lst2.foldLeft(100)((x,y) => x + y)
}
