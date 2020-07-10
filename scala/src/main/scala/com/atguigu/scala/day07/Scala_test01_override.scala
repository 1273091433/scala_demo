package com.atguigu.scala.day07

/**
 * @Classname Scala_test01_override
 * @Description TODO
 * @Date 2020/5/26 10:53
 * @Created by 86153
 */
object Scala_test01_override {
  def main(args: Array[String]): Unit = {
    val user0 = new User07
    user0.test()
  }
}

abstract class Person07{
  var name:String
  val age:Int = 10
  def test(): Unit ={
    println(name)
    println(age)
  }
  println("父类 age _"+this.age)
  println("父类 name _"+this.name)
}

class User07 extends Person07{
  var name: String = "123"
  override val age:Int = 20
  println("子类 age _"+age)
  println("子类 name _"+name)
}