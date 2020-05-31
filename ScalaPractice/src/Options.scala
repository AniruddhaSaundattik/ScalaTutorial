object Options extends App {
  val num1 = Option(1)
  println(num1) //return some(value)
  println(num1.get) //returns the value from num1

  val num2 = Option(None)
  println(num2.get)

  val num3 = Option(null)
  //println(num3.get) //will throw NoSuchElementException
  //you can check if a value is present in Option
  if(num3.isDefined){
    println(num3.get)
  } else {
    println("num3 is empty")
  }

  //better way of handling the if else with option
  println(num3.getOrElse("Empty"))
  println(num1.getOrElse("Empty"))
  
  def map2[A, B, C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] = {
    a match {
      case Some(value) => {
        b match {
          case Some(valueB) => Some(f(value,valueB))
          case None => None
        }
      }
      case None => None

    }
  }
  
  def map3[A, B, C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] = {
   a.flatMap(oA => {
     b.map(oB => {
       f(oA,oB)
     })
   })
  }
}
