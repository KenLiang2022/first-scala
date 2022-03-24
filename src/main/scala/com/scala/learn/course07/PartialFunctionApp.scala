package com.scala.learn.course07

import scala.util.Random

object PartialFunctionApp {

  def main(args: Array[String]): Unit = {
    val arrays = Array("Ken J Liang", "KIKI", "Sam")

    val name = arrays(Random.nextInt(arrays.length))

    name match {
      case "Ken J Liang" => println("Ken")
      case "KIKI" => println("KIKI")
      case _ => println("this is Sam")
    }
  }

  def sayHello: PartialFunction[String, String] = {
    case "Ken J Liang" => "Ken"
    case "KIKI" => "KIKI"
    case _ => "this is Sam"
  }

  println(sayHello("123"))

}
