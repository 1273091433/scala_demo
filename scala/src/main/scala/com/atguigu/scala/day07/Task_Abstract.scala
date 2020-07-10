package com.atguigu.scala.day07

/**
 * @Classname Task_Abstract
 * @Description TODO
 * @Date 2020/5/26 20:01
 * @Created by 86153
 */
object Task_Abstract {
  def main(args: Array[String]): Unit = {
    val abstract_0 = new task_Abstract_03
    abstract_0.test01
    println(abstract_0.name)
  }
}

/*
  抽象类，抽象属性，抽象方法
 */

abstract class task_Abstract_01{

}
abstract class task_Abstract_02{
  var name:String
  def test01:Unit
}

class task_Abstract_03 extends task_Abstract_02{
  override var name: String = _

  override def test01: Unit = {
    println("抽象方法 。。。 ")
  }
}