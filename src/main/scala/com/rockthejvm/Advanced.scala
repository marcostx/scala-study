package com.rockthejvm

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success, Try}

object Advanced extends App {
  // lazy evaluation
  lazy val lazyValueSideEffect = {
    println("I am very lazy")
    42
  }

  val eagerValue = lazyValueSideEffect + 1


  // pseudo-collections: Option, Try
  // Option : guards Null values
  def methodWhichCanReturnNull(): String = "hello, Scala"
  val anOption = Option(methodWhichCanReturnNull()) // Some("hellw, Scala") or None

  val stringProcessing = anOption match {
    case Some(string) => s"I have obtained a valid string : $string"
    case None => "I have not obtained a valid string"
  }

  def methodWhichcanThrowException(): String = {
    throw new RuntimeException("I am throwing an exception")
  }
  val aTry = Try(methodWhichcanThrowException()) // Success("I am not throwing an exception") or Failure(RuntimeException)
  // a coolection with either a value with code went weell or an error with code
  val anotherStringPRocessing = aTry match {
    case Success(string) => s"I have obtained a valid string : $string"
    case Failure(ex) => s"I have not obtained a valid string : ${ex}"
  }

  /*
  Evaluate somethind on another thread (asynchronous programming)
   */
  val aFuture = Future {
    // long computation
    println("Loading")
    Thread.sleep(1000)
    println("I have computed a value")
    42
  }

  // Implicits basics
  // implicit arguments
  def aMethodWithImplicitArgs(implicit arg: Int) = arg + 1
  implicit val implicitArg = 2
  println(aMethodWithImplicitArgs) // aMethodWithImplicitArgs(implicitArg) = 3

  // implicit conversions
  implicit class MyRichInteger(n: Int) {
    def isEven() = n % 2 == 0
  }

  println(23.isEven) // new MyRichInteger(23).isEven() = false
}
