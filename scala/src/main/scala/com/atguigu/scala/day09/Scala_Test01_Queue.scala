package com.atguigu.scala.day09

import scala.collection.mutable

/**
 * @Classname Scala_Test01_Queue
 * @Description TODO
 * @Date 2020/5/29 18:31
 * @Created by 86153
 */
object Scala_Test01_Queue {
  def main(args: Array[String]): Unit = {
    val que = new mutable.Queue[String]
    /*
    添加数据
     */
    que.enqueue("qqq","www","eee")

    /*
    读取数据
     */
    val str1: String = que.dequeue()
    val str2: String = que.dequeue()
    val str3: String = que.dequeue()

    println(str1)
    println(str2)
    println(str3)
  }
}
