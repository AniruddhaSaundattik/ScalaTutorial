object IfExpression extends App {
  //usual style of using If else as statements
  val x = 10
  if (x == 20) {
    println("x is equal to 20")
  } else if (x > 20) {
    println("x is greater than 20")
  } else {
    println("x not equal to 20 & lesser than 20")
  }

  // using If else as expressions
 val y = 10
 val result = if (y ==10) "y is 10" else "not 10"
  println(result)

  //checking both conditions should match
  if(x == 10 && y == 90){
    println("x is 10 and y is 90")
  }

  //one of the two should match
  if(x > 10 || y > 10){
    println("Either x is greater than 10 or y is greater than 10")
  }
}
