import scala.concurrent.Future
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global

object Map_FlatMapImplementations extends App {
  def myMap[A,B](opt: Option[A])(f: A => B): Option[B] ={
    Option(f(opt.get))
  }

  def myFlatMap[A,B](opt:Option[A])(f: A => Option[B]): Option[B] = {
    opt.map(a => f(a)).get
  }

  def myMapList[A,B](lst: List[A])(f:A => B): List[B] = {
    var output: List[B] = List()
    lst.foreach(a =>
      output = output.+:(f(a))
    )
    output
  }

  def myFlatMapList[A,B](lst:List[A])(f: A => List[B]) : List[B] = {
    var output: List[B] = List()
    lst.foreach( a => {
      output = output.concat(f(a))
    })
    output
  }

  def myMapFuture[A,B](future: Future[A])(f:A => B): Future[B] = {
    future.onComplete {
        case Success(value) => return Future { f(value) }
        case Failure(exception) => println(exception.getMessage)
        //case _ => return null
      }
    return null
  }

  def myFlatMapFuture[A,B](future: Future[A])(f:A => Future[B]): Future[B] = {
    future.onComplete{
      case Success(value) => return f(value)
      case Failure(exception) => println(exception.getMessage)
    }
    return null
  }

  def myMapEither[A,B,B1](either: Either[A,B])(f:B => B1): Either[A,B1] = {
    either match {
      case Right(value) => Right(f(value))
      case Left(value) => Left(value)
    }
  }
}
