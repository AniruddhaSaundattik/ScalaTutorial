object PlayWithMaps extends App {
  val myMap : Map[Int,String] = Map(1 -> "Ani", 2 -> "Ayush", 3 -> "Soumya", 4 -> "Dhara" )
  println(myMap)
  println(myMap.getClass)

  val myMap2 = Map(1 ->"abc" , 2 -> "xyz", 2 -> "def") // if there are duplicate keys..last value will override
  println(myMap2) //2 -> "xyz" will be replaced by 2 -> "def"

  //print only keys from a set
  println(myMap.keys)
  println(myMap.values)

  //get a value for a particular key
  println(myMap(2)) //will throw exception if key not present

  //check if a key is present.. returns a boolean
  println(myMap.contains(3))

  myMap.keys.foreach(k => println(k))

  //foreach on a map gives a tuple
  myMap.foreach(a => println(s"The value for key ${a._1} is ${a._2}"))
}
