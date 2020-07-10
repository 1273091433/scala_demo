package com.atguigu.scala.day08

import scala.collection.mutable

/**
 * @Classname Scala_test01_list
 * @Description TODO
 * @Date 2020/5/27 11:04
 * @Created by 86153
 */
object Scala_test03_Map_02 {
  def main(args: Array[String]): Unit = {
    /*
    可变集合
     */
    val map: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4)
    map.put("e", 5)
    map.put("d", 4)

    val map1: mutable.Map[String, Int] = map + ("f" -> 5)

    /*
    修改数据
     */
    map.update("e",6)
    map("e")= 7
    println(map)
    println(map1)
    println(map eq map1)
  }
}
