package com.scala.learn

object ArrayExample extends App {

  val a = new Array[String](3)
  a(0) = "Ken"
  a(1) = "J"
  a(2) = "Liang"

  a.foreach(aa=>println(aa))

  val b = Array(11,22,33,44,55)

  println(b.sum)

  println(b.mkString(","))

  println(b.mkString("~~~",",","~~~"))

  val c = scala.collection.mutable.ArrayBuffer[Int]()

  c+=1
  c+=2
  c+=(3,4,5,6)
  c.append(3,4,5)
  c ++= Array(77,88,99)
  c.insert(0,123)
  c.remove(4,2)
  //c.trimEnd(2)

  c.takeRightInPlace(2)

  val d = c.toArray
  println(d.mkString(","))
  println(c)


}
