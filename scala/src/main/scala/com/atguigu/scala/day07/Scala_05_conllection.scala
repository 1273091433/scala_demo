package com.atguigu.scala.day07

import scala.collection.mutable.ArrayBuffer

/**
 * @Classname Scala_05_conllection
 * @Description TODO 不可变集合
 * @Date 2020/5/26 20:09
 * @Created by 86153
 */
object Scala_05_conllection {
  def main(args: Array[String]): Unit = {
    /*
      创建可变数组
     */
    val ints = new ArrayBuffer[Int]
    val ints1: ArrayBuffer[Int] = ArrayBuffer[Int](1, 2, 3, 4, 5, 6)

    /*
      新增
     */
    ints.insert(0,1)
    ints.insert(1,2)
    ints.insert(2,3)
    /*
    删除
     */
    ints.remove(2)
    /*
    修改
     */
    ints.update(1,20)
    println("1..."+ints(1))

    for(i <- ints){
      println(i)
    }
    ints.foreach(println)

    val arr01 = new Array[Int](4)
    println("length"+arr01.length) // 4
    }
}
