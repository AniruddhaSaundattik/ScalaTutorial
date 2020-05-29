object Arrays extends App {
  val arr = Array(1,2,3,4,5)
  arr.foreach(x => println(x))

  val arr2: Array[Int]  = new Array[Int](5)
 //Arrays are mutable in scala
  arr2(0) = 10
  //default value of Int will be taken for values not defined
  arr2.foreach(x => println(x))

  //merge two arrays
  val newArr = arr.concat(arr2)
  newArr.foreach(x => println(x))

  //get the size of the array
  println("Size is " + arr.length)
  println("Size is " + arr2.size)
}
