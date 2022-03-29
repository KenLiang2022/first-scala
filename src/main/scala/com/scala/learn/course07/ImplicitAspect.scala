package com.scala.learn.course07

import java.io.File

object ImplicitAspect {

  implicit def man2superMan(man: Man): SuperMan = new SuperMan(man.name)

  implicit def file2richFile(file: File): RichFile = new RichFile(file)

}
