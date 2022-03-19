package com.scala.learn

object AbstractExample {

  def main(args: Array[String]): Unit = {
    val s = new Student("Ken")
    s.speak
    s.say("kiki")
    println(s.job, s.salary)

    println(s())
  }

  abstract class Person {
    def speak

    def say(name: String)

    val job: String
    val salary: Long
  }

  class Student(name: String) extends Person {
    def apply(): Int = {
      666
    }

    override def speak = {
      println(name + " is speaking")
    }

    override def say(name: String) = {
      println(name + " is saying")
    }

    def make(): Unit = {

    }

    override val job: String = "job"
    override val salary: Long = 99999
  }
}
