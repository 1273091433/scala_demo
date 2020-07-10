package com.atguigu.scala.day09

/**
 * @Classname Scala_Test01_Queue
 * @Description TODO
 * @Date 2020/5/29 18:31
 * @Created by 86153
 */
object Scala_Test03_Collection {
  def main(args: Array[String]): Unit = {
    /*
    常用方法
     */
    val list = List(1,2,3,4)
    val list1 = List(3,4,5,6)

    // 集合头
    println(list.head)
    // 集合尾
    println(list.last)
    // 集合尾迭代
    println(list.tail)
    // 集合初始化
    println(list.init)
    // 集合并集
    println(list.union(list1))
    // 差集
    println(list.diff(list1))
    // 交集
    println(list.intersect(list1))
    // 切分集合  num:集合容量
    println("splitAt=>" + list.splitAt(4))
    //滑动
    list.sliding(2).foreach(println)
    //滑动 步长
    list.sliding(2,3).foreach(println)
    // 拉链
    println(list.zip(list1))
    println(list.zip(list1.reverse))
    // 数据索引拉链
    println(list.zipWithIndex)
  }
}
