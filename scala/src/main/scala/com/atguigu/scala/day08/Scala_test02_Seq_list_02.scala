package com.atguigu.scala.day08

import scala.collection.mutable.ListBuffer

/**
 * @Classname Scala_test01_list
 * @Description TODO
 * @Date 2020/5/27 11:04
 * @Created by 86153
 */
object Scala_test02_Seq_list_02 {
  def main(args: Array[String]): Unit = {
    /*
    可变集合
     */
    val buffer: ListBuffer[Int] = ListBuffer(1, 2, 3, 4, 5)
    /*
    新增
     */
    buffer.append(4,5,6)
    buffer.insert(7,8,9)
    /*
    删除
     */
    buffer.remove(1,2)
    /*
    修改
     */
    buffer.update(1,1)
    /*
    查询
     */
    println(buffer(1))
    /*
    遍历
     */
    buffer.foreach(println)
    println(buffer)
  }
}
