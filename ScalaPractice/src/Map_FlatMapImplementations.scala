import scala.concurrent.Future
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global

object Map_FlatMapImplementations extends App {
  def myMap[A,B](opt: Option[A])(f: A => B): Option[B] ={
   opt match {
     case Some(value) => Some(f(value))
     case None => None
   }

  }

  def myFlatMap[A,B](opt:Option[A])(f: A => Option[B]): Option[B] = {
    opt match {
      case Some(value) => f(value)
      case None => None
   }
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
    future.transform {
      case Success(value) => Success(f(value))
      case Failure(exception) => Failure(exception)
    }
  }

  def myFlatMapFuture[A,B](future: Future[A])(f:A => Future[B]): Future[B] = {
    future.transformWith{
      case Success(value) => f(value)
      case Failure(exception) => throw exception
    }
  }

  def myMapEither[A,B,B1](either: Either[A,B])(f:B => B1): Either[A,B1] = {
    either match {
      case Right(value) => Right(f(value))
      case Left(value) => Left(value)
    }
  }

  def myFlatMapEither[A,B,B1](either: Either[A,B])(f:B => Either[A,B1]): Either[A,B1] = {
    either match {
      case Right(value) => f(value)
    }
  }
}
