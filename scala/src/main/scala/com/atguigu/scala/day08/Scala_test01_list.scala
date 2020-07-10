package com.atguigu.scala.day08

import scala.collection.immutable.Nil

/**
 * @Classname Scala_test01_list
 * @Description TODO
 * @Date 2020/5/27 11:04
 * @Created by 86153
 */
object Scala_test01_list {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    println(list(0))

    val list01: List[Int] = 1 :: 2 :: 3 :: 5 :: 6 :: Nil
    println(list01)

    val list02 = 1 :: 2 :: 3 :: 5 :: list :: Nil
    println(list02)

    val list03 = 1 :: 2 :: 3 :: 5 :: list ::: Nil
    println(list03)
  }
}
