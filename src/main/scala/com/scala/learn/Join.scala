package com.scala.learn

import org.apache.spark.sql.SparkSession

object Join {

  val map = Map("aa" -> "aaa")

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master("local")
      .appName("test app")
      .getOrCreate()

    spark.stop()
  }
}
