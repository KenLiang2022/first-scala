package com.scala.learn

object ConstructFunction {
  def main(args: Array[String]): Unit = {
    val person = new Person("123")

    val s1 = new Student("123")
    val s2 = new Student(123,name = "ken Liang need to learn Scala")
    val s3 = new Student()

    println(s2)
  }

  //主构造器
  //如果name不加val或者var修饰，则在外部用不了person.name
  class Person(name: String) {
    println("init person...")
    println(this.name)
    println("end person")

    //附属构造器
    def this(name: String, age: Int, sex: String) {
      this(name) //附属构造器的第一行代码，必须调用主构造器或者其他附属构造器
      println(age + ":" + sex)
    }

    //不知道为啥会报错
    //def this() = this(name)

  }

  class Student() {
    println("init student")

    override def toString(): String={
      "name" + name + " " + "age" + age
    }

    var name: String = _
    var age: Int = _

    //不可以这样写！！！！
    //def this() = this()

    def this(name: String) = {
      this()
      this.name = name
    }

    def this(age: Int) {
      this()
      this.age = age
    }

    def this(age: Int, name: String) {
      this()
      println(age)
      this.name = name
    }

    println("end student")

  }
}
