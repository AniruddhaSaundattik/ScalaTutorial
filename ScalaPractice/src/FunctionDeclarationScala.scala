object FunctionDeclarationScala extends App{
  def doSomething(str1: String, str2: String): String = {
    return str1 + str2
  }

  def functionWithArgument(empId: Int ,name: String, age:Int) = {
    println(s"Employee Id is $empId and the Employee Name is $name and his age is $age")
  }

  //without name arguments
  functionWithArgument(1,"Aniruddha",32)
  //mixed order of arguments
  functionWithArgument(name = "Aniruddha", age = 32, empId = 1)
  //only one named argument
  //functionWithArgument(age=32, 1, "Aniruddha") //will not work
  //functionWithArgument("Aniruddha",32, empId = 1) // this will not work
  functionWithArgument(1,"Aniruddha", age = 32)
  functionWithArgument(empId = 1, "Aniruddha", 32)
}
