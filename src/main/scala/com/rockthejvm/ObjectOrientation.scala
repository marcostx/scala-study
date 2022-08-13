package com.rockthejvm

object ObjectOrientation extends App{
  class Animal  {
    val creatureType = "wild"
    def eat = println("nomnomnom")
  }

  class Dog(val dogName: String) extends Animal {

    override def eat: Unit = {
      println("crunch crunch")
    }
  }

  val myDog  = new Dog("Luke")
  println(myDog.dogName)

  val aDeclaredAnimal: Animal = new Dog("Hachie")
  aDeclaredAnimal.eat


  // abstract classes
  abstract class WalkingAnimal {
    protected val hasLegs = true
    def walk(): Unit
  }
  class Cat extends WalkingAnimal {
    override def walk(): Unit = println("cat is walking")
  }

  // interfaces = can leave all methods abstract
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore with Philosopher {
    override def eat(animal: Animal): Unit = println("nomnomnom")

    override def ?!(thought: String): Unit = ???
  }

  trait Philosopher {
    def ?!(thought: String): Unit //
  }

  def ?!(thought: String): Unit = println(s"I was thinking about $thought")

  val basicMath: Int =  1 + 1
  val equivalentBasicMath: Int = 1.+(2)

  // anonymous classes
  val dinossaur = new Carnivore {
    override def eat(animal: Animal): Unit = println("I am a dinossaur and I can eat anything")
  }


  // singleton object
  object MySingleton { // the only intance of the MySingleton type
    val mySpecialValue  = 53278
    def mySpecialMethod(): Int = 5327
    def apply(x: Int): Int = x + 5 // se tiver um apply, pode chamar MySingleton(5)
  }

  MySingleton.mySpecialMethod()
  MySingleton(5)

  // exceptions
  try {
    val x: String = null
    x.length
  } catch {
    case e: Exception => println("I caught an exception")
  } finally {
    println("finally")
  }

  // generics
  abstract class MyList[T] {
    def head: T
    def tail: MyList[T]
    def add[B >: T](element: B): MyList[B] = ???
  }

  val aList: List[Int] = List(1,2,3,4)
  val first = aList.head
  val rest = aList.tail

}
