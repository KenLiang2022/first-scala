package com.scala.learn

object ApplyExample {
  def main(args: Array[String]): Unit = {
    for (i <- 0 until 10) {
      ApplyTest.incr
    }
    //说明object本身就是一个单例对象
    println(ApplyTest.count)

    val a = ApplyTest() //===> 调用了object里面的apple方法

    println("~~~~~~~~~~~~~~~~~~~~~~~")

    val b  = new ApplyTest("ggg")
    b()

    //类名() ===> object.apply
    //对象() ===> Class.apply

  }
}

//伴生类和伴生对象

/**
 * 如果有一个class，还有与class同名的object
 * 那么就称 class是object的伴生类 object是class的伴生对象
 */
object ApplyTest {
  println("object in")
  var count = 0

  def incr = {
    count += 1
  }

  def apply() = {
    println("object apple method")
    //在object里面new一个class对象
    new ApplyTest("Ken")
  }

  println("object out")
}

class ApplyTest(name: String) {
  println("class in")

  def apply() = {
    println("class apply method")
  }

  println("class out")
}
