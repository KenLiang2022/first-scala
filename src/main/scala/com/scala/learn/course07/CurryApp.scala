package com.scala.learn.course07

object CurryApp {

  def main(args: Array[String]): Unit = {

    println(add(1)(2)(3))

    def add(x:Int)(y:Int)(z:Int) = x + y + z

  }

}
