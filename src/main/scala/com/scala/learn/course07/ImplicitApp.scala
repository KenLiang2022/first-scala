package com.scala.learn.course07

object ImplicitApp extends App{

  //隐式转换
  implicit def man2superMan(man:Man):SuperMan = new SuperMan(man.name)

  val man = new Man("Ken J Liang")
  man.eat()
  man.fly()

}

class Man(val name:String){

  def eat(): Unit ={
    println(s"Man[$name] can eat")
  }
}

class SuperMan(val name:String){
  def fly(): Unit ={
    println(s"superMan[$name] can fly")
  }
}
