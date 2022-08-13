package com.rockthejvm

object PatternMatching extends App {
  // switch statement
  val anInteger: Int = 55

  val aOrder = anInteger match {
    case 1 => "first"
    case 2 => "second"
    case 3 => "third"
    case _ => anInteger + "th"
  }

  case class Person(name: String, age: Int)
  val bob = Person("Bob", 20) // Person.apply("bob", 20)

  // only work with case classes
  val personGreeting = bob match {
    case Person(n, a) => s"Hi, my name is $n and I am $a years old"
    case _ => "I don't know who I am"
  }

  // deconstructing tuples
  val aTuple = ("megadeth", "thrash metal")
  val bandDescription = aTuple match {
    case (band, genre) => s"$band belongs to the genre$genre"
    case _ => "I don't know what you are talking about"
  }

  // deconstructing lists
  val aList = List(1,2,3)
  val listDescription = aList match {
    case List(_,2,_) => "This is a list with 2 in it"
    case _ => "unknown list"
  }

  // PM try all cases in sequence

}

