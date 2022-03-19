package com.scala.learn

object CaseClassExample {
  def main(args: Array[String]): Unit = {
    println(Dog("dog"))
  }


  case class Dog(name:String){

    override def toString: String = "this is a " + name
  }

}
