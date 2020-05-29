object FunctionExample extends App {
  def printHello : Unit = println("Hello!")
  printHello

  // taking inputs/ using parameters
  def addNumbers(x: Int, y: Int) : Int = {
    x + y
  }
 println(addNumbers(10,20))
  // default value functions
  def employeeRecords(name: String, exp: Int, dept: String = "SDST") = {
    println(s"$name has $exp years of experience & is working in $dept")
  }
  employeeRecords("Aniruddha", 10, "Services")
  employeeRecords("Aidan", 18)

  //anonymous functions
  var sum = (x: Int, y: Int) => x + y
  println(sum)
  println(sum(10,20))
}
