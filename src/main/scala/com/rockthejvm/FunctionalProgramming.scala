package com.rockthejvm

import scala.:+

object FunctionalProgramming extends App {

  /*
  Functional programming

  - compose functions
  - pass functions as parameters
  - return functions as results

  JVM was not proposed for functional programming

  Conclusion : FunctionX
   */

  val simpleIcrementer = new Function[Int, Int] {
    override def apply(v1: Int): Int = v1 + 1
  }

  simpleIcrementer(23)

  //  syntax sugars
  val doubler: Function1[Int, Int] = (x: Int) => x * 2
  doubler(4)

  // higher order functions
  val aMappedList = List(1,2,3).map(x => x + 1) // higher order function HOF
  val aFlatMappedList = List(1,2,3).flatMap(x => List(x, x + 1))

  val aFilteredList = List(1,2,3,4,5,6).filter(x => x > 4 )

  // all pairs between 1,2,3 and letters a,b,c
  val aPairList = for {
    n <- List(1,2,3)
    ch <- List('a', 'b', 'c')
  } yield (n, ch)

  val allPairs = List(1,2,3).flatMap(number => List("a", "b", "c").map(letter => s"$number-$letter"))

  // for comprehensions
  val alternativePairs = for {
    number <- List(1,2,3)
    letter <- List("a", "b", "c")
  } yield s"$number-$letter"

  //..//...// Collections

  // Lists
  val aList = List(1,2,3)
  aList.head
  aList.tail
  val aPrependedList = 0 :: aList
  val amExtendedList = 0 +: aList :+ 4

//  Sequence
  val aSequence: Seq[Int] = Seq(1,2,3)
  val element = aSequence(2)

  // vectors: fast sequence implementation
  val aVector = Vector(1,2,3)

  // sets
  val aSet = Set(1,2,3,4,1,2,3)
  val aSetHas5 = aSet.contains(5)
  val anAddedSet = aSet + 5


  // ranges
  val aRange = 1 to 100
  val twoByTwo = aRange.map(x => x * 2).toList // List(2,4,6...)

  // tuples = groups of values under the same value
  val aTuple = (1,2.3,"Bon Jovi")

  // maps
  val aPhoneBook: Map[String, Int] = Map(
    ("Jim", 555),
    ("Pam", 555)
  )


}
