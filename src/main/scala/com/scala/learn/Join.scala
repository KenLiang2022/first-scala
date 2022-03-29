package com.scala.learn

import jdk.internal.module.IllegalAccessLogger.Mode
import org.apache.spark.sql.{SaveMode, SparkSession}

object Join {

  val map = Map("aa" -> "aaa")

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master("local")
      .appName("test app")
      .getOrCreate()

    val txt = spark.read.text("/Users/liangjian/Documents/gitKet.txt")

    txt.show

    txt.write.format("text").mode(SaveMode.Overwrite).save("/Users/liangjian/Documents/aaa")

    spark.stop()
  }
}
