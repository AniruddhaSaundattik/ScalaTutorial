object PlayWithSets extends App {
  //Define a set
  val mySet:Set[Int] = Set(1,2,3,4,5,5) // duplicate values are removed.. set contains only uniques
  println(mySet)

  println(mySet.+(6))

  //Sets by default are immutable but can be mutable
  //mySet(0) = 12 // Error

  var myMutableSet:scala.collection.mutable.Set[Int] = scala.collection.mutable.Set(1,2,3,6)
  //mySet.remove  // no remove method for immutable set
  myMutableSet.remove(6) // remove method available for mutable set
  myMutableSet.add(7)
  println(myMutableSet)
  val mySet2 = Set("maxx","Joe","Lucy","Steve")
  //check if 4 is present inside a set..4 is not an index like list but a value
  println(myMutableSet(4)) // returns a boolean
  println(mySet2("Steve"))
  //concatenate two sets
  println(mySet ++ myMutableSet)

  println(mySet.intersect(myMutableSet))
}
