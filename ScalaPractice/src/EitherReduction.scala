object EitherReduction extends App {
  def findFirstError(l: List[Either[String, Int]]): Option[Either[String, Int]] ={
    l.filter(x => x.isLeft).headOption
    l.find(x => x.isLeft)
  }

  def findAllCorrect(l: List[Either[String, Int]]): List[Either[String, Int]] = {
    l.filter(x => x.isRight)
  }

  def findSum(l: List[Either[String, Int]]): Either[String, Int] = {

    l.filter(e => e.isRight).reduce((e1, e2) => {
      e1 match {
        case Right(value1) => e2 match {
          case Right(value2) => Right(value1 + value2)
        }
      }
    })

    Right(l.collect{case Right(value) => value}.sum)
    //val eth: Either[String, Int] = Right(x)

  }

}
