package com.atguigu.scala.day06

/**
 * @Classname Scala_test01
 * @Description TODO
 * @Date 2020/5/25 9:18
 * @Created by 86153
 */
object Scala_test02_overwrite {

  def main(args: Array[String]): Unit = {
    val emp:Emp = new Emp()
    println(emp.getValue())
  }
  class Person{
    private var num:Int = 10
    def getValue()={
      getNUm + 10
    }
    def getNUm()={
      num
    }
  }

  class Emp extends Person {
    private var num:Int = 20

 /*   override def getValue(): Int = {
      num +20
    }*/
    override def getNUm()={
      num
    }
  }
}

