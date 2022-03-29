package com.scala.learn.course07

import java.io.File
import ImplicitAspect._

import scala.io.Source

object ImplicitApp extends App {

  val man = new Man("Ken J Liang")
  man.eat()
  man.fly()

  val file = new File("/Users/liangjian/Documents/gitKet.txt")
  println(file.read)

}

class Man(val name: String) {

  def eat(): Unit = {
    println(s"Man[$name] can eat")
  }
}

class SuperMan(val name: String) {
  def fly(): Unit = {
    println(s"superMan[$name] can fly")
  }
}

class RichFile(val file: File) {
  def read: String = {
    //读取文本的内容
    //scala.io.Source.fromFile(file.getPath).mkString
    Source.fromFile(file.getPath).mkString
  }
}
