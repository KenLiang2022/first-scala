package com.scala.learn

object SimpleObject {
  def main(args: Array[String]): Unit = {
    val person = new Person
    person.name = "123"
    person.age = 111
    person.show
    person.pSex(sex = "male")
    person.show
  }

  class Person {
    var name: String = _
    var age: Int = _
    val CONFIG: Int = 18000

    private [this] var sex: String = _

    def pSex(sex: String): String = {
      this.sex = sex
      this.sex
    }

    def show(): Unit = {
      println(name + age + sex)
    }


  }
}
