package com.atguigu.scala.day02

/**
 * @Classname Scala_03_Functional
 * @Description TODO
 * @Date 2020/5/20 19:15
 * @Created by 86153
 */
object Scala_03_Functional_hell2 {
  def main(args: Array[String]): Unit = {
    //函数式编程  地狱级别
    def test(f: => Unit)={
      f _
    }

    test{
      print("战三")
      print("战三")
      print("战三")
      print("战三")
    }()

  }
}
