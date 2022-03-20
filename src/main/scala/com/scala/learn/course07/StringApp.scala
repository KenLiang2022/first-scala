package com.scala.learn.course07

object StringApp extends App{
  val hello = "Hello:"
  val name = "Ken J Liang"
  val team = "LPL SW"

  println(s"$hello:$name:$team")

  val b =
    """
      |这是一个
      |多行的
      |字符串
    """.stripMargin

  println(b)

}
