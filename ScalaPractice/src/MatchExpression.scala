object MatchExpression extends App {
  val age = 18
  age match {
    case 16 => println("Still a Juvenile")
    case 18 => println("Valid age for voting")
    case 25 => println("valid age for drinking")
    case _ => println("no match found")
  }

  // using match as an expression
  val result = age match {
    case 16 => "Still a Juvenile"
    case 18 => "Valid age for voting"
    case 25 => "valid age for drinking"
    case _ =>  "no match found"
  }
  println(s"The result is $result")

  //using multiple matchers to find odd/even numbers
  val i = 2
  i match {
    case 2 | 4 | 6 | 8 | 10 => println("Even number")
    case 1 | 3 | 5 | 7 | 9 => println("odd number")
  }
}
