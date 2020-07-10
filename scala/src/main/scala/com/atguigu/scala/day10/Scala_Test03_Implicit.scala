package com.atguigu.scala.day10

/**
 * @Classname Scala_Test03_Implicit
 * @Description TODO
 * @Date 2020/5/31 20:04
 * @Created by 86153
 */
object Scala_Test03_Implicit {
  def main(args: Array[String]): Unit = {
    /*implicit def test(num:Double):Int ={
      num.toInt
    }
    val a:Int = 10
    val b:Double = a +1.0
    val c:Int = b + 1
*/
    /*
    隐式参数
     */
    /*def test02(implicit num:Double=2):Int ={
      num.toInt
    }
    implicit val b:Double = 1.0
    //val c:Int = b + 1
    println(test02)
    println(test02())*/
    /*
    隐式类
     */
    val user100 = new User1003
    user100.add()
    
  }
  class User1003{

  }
  implicit class Emp1003(user1003: User1003){
    def add(): Unit ={
      println("emp add function ...")
    }
  }
}

