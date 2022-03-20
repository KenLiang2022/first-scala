package com.scala.learn.course07

object FunctionApp extends App {

  val add1 = (x: Int, y: Int) => x + y


  println(add1(50, 60))
  println(add(50, 60))
  println(add2(1, 2))

  def add(x: Int, y: Int):Int = x + y

  def add2 = (x: Int, y: Int) => x + y

}
