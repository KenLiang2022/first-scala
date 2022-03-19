package com.scala.learn

object ExtendExample {

  def main(args: Array[String]): Unit = {
    val count = 50

    val number = {
      if(count > 0){
        count
      }else{
        20
      }
    }

    val flag = number > 100

    println(number,flag)
  }

  class Person(name: String, age: Int, sex: String) {

  }

  class Student(name: String, sex: String, age: Int, major: String) extends Person(name, age, sex) {

  }

}
