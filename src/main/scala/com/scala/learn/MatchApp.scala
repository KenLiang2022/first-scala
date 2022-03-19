package com.scala.learn

import scala.util.Random

object MatchApp extends App {

  val names = Array("KIKI","KEN","Scala")
  val name = names(Random.nextInt(names.length))

  name match {
    case "KIKI" => println("now is KIKI")
    case "Scala" => println("now is Scala")
    case _ => println("can not match")
  }

  judgeGrade("Lishi","A")
  judgeGrade(grade = "D",name="Lishi")

  def judgeGrade(name:String,grade:String)={
    grade match {
      case "A" => println("Excellent!!")
      case "B" => println("Good!")
      case "C" => println("not Bad!")
      case _ if(name.equals("Lishi")) => println(name + "")
      case _ => println("need to more harder")
    }
  }

  def greeting(array:Array[String]): Unit ={

  }

}
