class StringInterpolation {

}

object PrintString extends App {
  val name = "Aniruddha"
  val age = 18
  println(name + " is " + age + " years old!")
  println(s"$name is $age years old!")
  println(f"$name%s is $age%d years old!")
  println(s"Hello \n World!")
  println(raw"Hello \n World!")
}