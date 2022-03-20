package com.scala.learn

import scala.util.Random

object MatchApp extends App {

  val names = Array("KIKI", "KEN", "Scala")
  val name = names(Random.nextInt(names.length))

  name match {
    case "KIKI" => println("now is KIKI")
    case "Scala" => println("now is Scala")
    case _ => println("can not match")
  }

  judgeGrade("Lishi", "A")
  judgeGrade(grade = "D", name = "Lishi")

  def judgeGrade(name: String, grade: String) = {
    grade match {
      case "A" => println("Excellent!!")
      case "B" => println("Good!")
      case "C" => println("not Bad!")
      case _ if name.equals("Lishi") => println(name + "")
      case _ => println("need to more harder")
    }
  }

  greetingArray(Array("Ken J Liang", "zhangsan", "lishi", "wangwu"))

  def greetingArray(array: Array[String]): Unit = {
    array match {
      case Array("zhangsan") => println("HI zhangsan")
      case Array(x, y) => println("HI:" + x + " , " + y)
      case Array("zhangsan", _*) => println("HI zhangsan and the other friends")
      case _ => println("everybody...")
    }
  }

  greetingList(List("zhangsan", "Ken", "J"))

  def greetingList(list: List[String]) = {
    list match {
      case "zhangsan" :: Nil => println("HI zhangsan...")
      case a :: b :: c :: Nil => println("HI:" + a + b + c)
      case "zhangsan" :: tail => println(tail)
      case _ => println("everybody...")
    }
  }

  matchType(Map("123" -> "4556"))

  def matchType(obj: Any) = {
    obj match {
      case i: Int => println("Int")
      case s: String => println("String")
      case map: Map[_, _] => map.foreach(println)
      case _ => println("not match..")
    }
  }

  class Person

  case class CTO(name: String, floor: Int) extends Person

  case class Emp(name: String, floor: Int, job: String) extends Person

  case class Other(name: String) extends Person

  def caseClassMatch(person: Person): Unit = {
    person match {
      case CTO(name, floor) => println("CTO:" + name + floor)
      case Emp(name, floor, job) => println("Emp:" + name + floor + job)
      case _ => println("other")
    }
  }

  caseClassMatch(Emp("Ken J Liang", 22, "IT"))

}
