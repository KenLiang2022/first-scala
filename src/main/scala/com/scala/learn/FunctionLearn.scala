package com.scala.learn

object FunctionLearn {
  def main(args: Array[String]): Unit = {
    //    println(add(1,3))
    //    println(three)
    //    sayHello
    //    sayName("1234")

    //命名函数调用
    //    println(speed(100, 10))
    //    println(speed(distinct = 100, time = 10))
    //    println(speed(time = 100f, distinct = 100))

    //println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9))

    val array = Array(1, "2", "4", 15f, Map("1" -> "3"))

    array.foreach(a => println(a))

    var (i,count) = (0,100)
    while (count > 0){
      i+=count
      count-=1
    }

    println(i)

  }

  def add(x: Int, y: Int): Int = {
    x + y
  }


  def three: Int = 1 + 2

  def sayHello: Unit = {
    println("hello say")
  }

  //默认参数函数
  def sayName(name: String = "liangian"): Unit = {
    println(name)
  }

  //命名函数
  def speed(distinct: Float, time: Float): Float = {
    distinct / time
  }

  //传入了多个参数
  def sum(numbers: Int*): Int = {
    var result = 0
    for (number <- numbers) {
      result += number
    }
    result
  }

  def testForFunction(length: Int = 1): Unit = {
    //这两者等价
    for (i <- 0 to length) {
      print(i + ",")
    }
    println()
    for (i <- 0.to(length)) {
      print(i + ",")
    }
    println()
    for (i <- 0 until length) {
      print(i + ",")
    }
    println()
    for (i <- 0.until(length)) {
      print(i + ",")
    }
    println()
    for (i <- 0 to length if i > 8) {
      print(i + "-")
    }
    println()

    for (r <- Range(1, length, 4)) {
      println(r)
    }
  }


}
