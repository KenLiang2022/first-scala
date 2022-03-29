package com.scala.learn.course07

object ImplicitParamApp extends App {

  //testParam(name = "123")

  //implicit val name = "Ken J Liang"

  //implicit val s1 = "Ken J Liang s1"

  implicit val s2 = "Ken J Liang s2"

  testParam

  def testParam(implicit name: String): Unit = {
    println(s"$name~~~")
  }

}
