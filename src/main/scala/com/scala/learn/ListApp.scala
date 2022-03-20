package com.scala.learn

object ListApp extends App {

  val l = List(1, 2, 3, "Ken J Liang_SP")

  println("print l in loop:")
  for (ele <- l) {
    println(ele)
  }

  println("print r:")
  val r = l.head :: Nil
  println(r)

  println("print l2:")
  val l2 = 1 :: 2 :: 3 :: Nil
  println(l2)

  println("r::l2:")
  println(r.head::l2)

  println("print l3:")
  val l3 = 2 :: l2
  println(l3)

  val l5 = scala.collection.mutable.ListBuffer[String]()
  l5 ++= List("123", "456")
  l5 -= ("123", "555")
  l5-="123"

  val l6 = l5.toList

  println(l5)
  println(l6)

  def sum(nums: Int*): Int = {
    if (nums.length == 0) {
      0
    } else {
      nums.head + sum(nums.tail: _*)
    }
  }

  println(sum(11,22,33,44,55))
}
