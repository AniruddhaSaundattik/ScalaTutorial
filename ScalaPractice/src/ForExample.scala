object ForExample extends App {
  //use a range from 1 to 5 and run a for loop on that
  for(i <- 1 to 5){
    println(i)
  }

  //defining a range until 6.. this will not include the second value
  for(i <- 1 until 6){
    println(i)
  }

  //running two loops together
  for(i <- 1 to 5; j <- 6 to 10){
    println(s"i is $i & j is $j")
  }

  //iterating over a list using for
  val lst = List(1,2,3,4,5)
  for(i <- lst){
    println(i)
  }
  // using a if condition inside for loop
  for(i <- lst; if (i >3)){
    println(s"elements greater than 3 in lst $i")
  }

  //using yield square each element of the list
  val result = for(i <- lst) yield  {
    i * i
  }
  println(result)
}
