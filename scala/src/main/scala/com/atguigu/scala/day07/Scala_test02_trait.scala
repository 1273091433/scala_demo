package com.atguigu.scala.day07

/**
 * @Classname Scala_test02_trait
 * @Description TODO
 * @Date 2020/5/26 12:16
 * @Created by 86153
 */
object Scala_test02_trait {
  def main(args: Array[String]): Unit = {
    val user070 = new User0702 with Op with Op2
    user070.test()
    user070.insert()
    user070.delete()
  }
}

trait Op{
  def insert():Unit={
    println("insert ... ")
  }
}
trait Op2{
  def delete():Unit={
    println("delete ... ")
  }
}

class User0702{
  def test(): Unit ={
    println("trait test ... ")
  }
}

