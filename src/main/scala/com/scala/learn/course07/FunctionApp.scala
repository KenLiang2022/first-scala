package com.scala.learn.course07

object FunctionApp extends App {

  val add1 = (x: Int, y: Int) => x + y


  println(add1(50, 60))
  println(add(50, 60))
  println(add2(1, 2))

  def add(x: Int, y: Int): Int = x + y

  def add2 = (x: Int, y: Int) => x + y

  //高阶函数
  //map 逐个去操作集合里每个元素
  val list = List(1, 2, 3, 4, 5, 6, 7, 8)
  list.map((l: Int) => l * 2).foreach(println)

  println(list.map(l => l * 2))
  //加入filter功能
  println(list.map(_ * 2).filter(_ > 8))

  //取前几个
  println(list.take(3))

  //reduce 两两相加
  println(list.reduce(_ - _))
  println(list.reduceLeft(_ - _))
  println(list.reduceRight(_ - _))

  println(list.fold(36)(_ - _))

  println(list.max)
  println(list.min)
  println(list.sum)

  val f = List(List(1, 2), List(3, 4), List(5, 6))
  println(f.flatten)

  println(f.map(_.map(_ * 2)))

  //flatten + map
  println(f.flatMap(_.map(_ * 2)))

  val array = Array("hello", "world", "hello", "world", "hello")

  array.map(_.split(",")).foreach(_.size)

  array.flatMap(_.split(",")).map((_, 1)).groupBy(_._1).view.mapValues(_.size).foreach(println)


}
