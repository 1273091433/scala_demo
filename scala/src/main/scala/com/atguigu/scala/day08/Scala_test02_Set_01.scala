package com.atguigu.scala.day08

/**
 * @Classname Scala_test01_list
 * @Description TODO
 * @Date 2020/5/27 11:04
 * @Created by 86153
 */
object Scala_test02_Set_01 {
  def main(args: Array[String]): Unit = {
    /*
    不可变集合
     */
    val set1 = Set(1, 2, 3)
    val set2 = Set(4, 5, 6)
    println(set1)
    println(set2)

    val set: Set[Int] = set1 + 68 + 30
    println(set)

    val set3: Set[Int] = set - 68
    println(set3)

    val set4: Set[Int] = set1 ++ set2
    println(set4)
  }
}
