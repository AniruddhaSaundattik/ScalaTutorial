object AnonymousFunction extends App {
  var strConcatenation = (x:String, y: String) => x.concat(y)

  def function2(f:(String,String)=>String) = {
    println(f("abc","xyz"))
  }

  function2(strConcatenation)
}
