package com.atguigu.scala.day08

import scala.collection.mutable.ListBuffer

/**
 * @Classname Scala_test01_list
 * @Description TODO
 * @Date 2020/5/27 11:04
 * @Created by 86153
 */
object Scala_test01_ListBuffer {
  def main(args: Array[String]): Unit = {
    val buffer: ListBuffer[Int] = ListBuffer(1, 2, 3, 4)

    buffer.append(5)
    /*
    在指定位置新增
     */
    buffer.insert(5,10)

    buffer(5)=20
    buffer.update(5,30)

    //buffer.remove(5)

    println(buffer)

    val map1 = Map( "a" -> 1, "b" -> 2, "c" -> 3 )
    println(map1.get("a"))
  }
}
