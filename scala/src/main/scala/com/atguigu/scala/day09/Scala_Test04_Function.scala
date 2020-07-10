package com.atguigu.scala.day09

/**
 * @Classname Scala_Test01_Queue
 * @Description TODO
 * @Date 2020/5/29 18:31
 * @Created by 86153
 */
object Scala_Test04_Function {
  def main(args: Array[String]): Unit = {
    /*
    计算函数
     */
    val list = List(1,2,3,4)
    val list1 = List(3,4,5,6)

    // 集合最小值
    println(list.min)
    // 集合最大值
    println(list.max)
    // 集合求和
    println(list.sum)
    // 集合乘积
    println(list.product)
    // 集合简化规约
    println("reduce => "+list.reduce((x: Int, y: Int) => { x + y }))
    println("reduce => "+list.reduce(_+_))
    val list2 = List("a", "b", "c")

    println("reduce =>" + list2.reduce(_ + _))
    println("reduceLeft =>" + list.reduceLeft(_ - _))
    println("reduceRight =>" + list.reduceRight(_ - _))

    // 集合折叠
    println(list.fold(10)(_-_))
    // 集合折叠左
    println(list.foldLeft(10)(_-_))
    // 集合折叠右
    println(list.foldRight(0)(_-_))
    // 10-(1-(2-(3-4)))
    // 集合扫描
    println(list.scan(0)(_ - _))
    // 集合扫描左
    println(list.scanLeft(0)(_ - _))
    // 集合扫描右
    println(list.scanRight(0)(_ - _))
  }
}
