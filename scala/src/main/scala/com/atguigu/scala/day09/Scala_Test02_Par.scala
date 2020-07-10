package com.atguigu.scala.day09

/**
 * @Classname Scala_Test01_Queue
 * @Description TODO
 * @Date 2020/5/29 18:31
 * @Created by 86153
 */
object Scala_Test02_Par {
  def main(args: Array[String]): Unit = {
    val result1 = (0 to 100).map{x => Thread.currentThread.getName}
    val result2 = (0 to 100).par.map{x => Thread.currentThread.getName}

    println(result1)
    println(result2)

  }
}
