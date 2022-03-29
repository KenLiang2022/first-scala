package com.scala.learn.course07

object ImplicitClassApp extends App {

  implicit class Calculator(x: Int) {
    def add(a: Int) = a + x
  }

  implicit class CalString(s: String) {
    def add(str: String) = str + s
  }

  implicit class AnyClass(s:Any){
    def ken()=println(s)
  }

  println("Ken J Liang".add("..KIKI"))
  println(12.add(3))
}
