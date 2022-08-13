package com.rockthejvm

object Basics extends App{
  // defining a value
  val meaningOfLife: Int = 42

  // Int, Boolean, String, Unit, Any, AnyRef, AnyVal
  val aBoolean = false

  // string operations
  val aString = "I love scala"
  val aComposedString  = "I" + " " + "love" + " " + "scala"
  val interpolatedString = s"The meaning of life is $meaningOfLife"

  // expresseions = structions that produce values
  val anExpression = 2 + 3
  // define a if-expression
  val ifExpression = if(meaningOfLife > 43) 56 else 8999
  val chainedIfExpression =
    if(meaningOfLife > 43) 8999
    else if(meaningOfLife < 0) -2
    else 0

  // code blocks
  val aCodeBlock: String = {
    val y = 2
    val z = y + 1
    if(z > 2) "hello" else "goodbye"
  }

  // define a function
  def myFunction(x: Int): Int = x + 5

  def myComplexFunction(x: Int, y: Int): Int = {
    if(x > y) x else y
  }

  // define a recursive function
  def factorial(n: Int): Int = {
    if(n <= 1) 1
    else n * factorial(n - 1)
  }

  // in Scala we dont use loops or iterations, we use recursion

  // type of Unit
  def myUnitReturningFunction(): Unit = println("hello")

  // check if a value is equal to zero
  def isZero(x: Int): Boolean = x == 0

}
