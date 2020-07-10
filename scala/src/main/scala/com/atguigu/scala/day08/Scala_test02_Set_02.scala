package com.atguigu.scala.day08

import scala.collection.mutable

/**
 * @Classname Scala_test01_list
 * @Description TODO
 * @Date 2020/5/27 11:04
 * @Created by 86153
 */
object Scala_test02_Set_02 {
  def main(args: Array[String]): Unit = {
    /*
    可变集合
     */
    val set: mutable.Set[Int] = mutable.Set(1, 2, 3, 4, 5)
    val set1: mutable.Set[Int] = mutable.Set(6, 7, 8, 9, 10)
    /*
    新增数据
     */
    set.add(6)

    println(set)
    println(set1)
    println(set1.mkString(","))
  }
}
