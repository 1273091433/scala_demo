package com.atguigu.scala.day10

/**
 * @Classname Scala_Test02_Exception
 * @Description TODO
 * @Date 2020/5/31 19:52
 * @Created by 86153
 */
object Scala_Test02_Exception {
  def main(args: Array[String]): Unit = {
    try {
    val num  = 0;
    val i = 10 / num
    }catch {
      //case ex:ArithmeticException => println("ArithmeticException 异常")
      case ex:Exception => println("Exception 异常")
    }finally {
      println("finally")
    }
  }
}
