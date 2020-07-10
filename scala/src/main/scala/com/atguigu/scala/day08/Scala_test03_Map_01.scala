package com.atguigu.scala.day08

/**
 * @Classname Scala_test01_list
 * @Description TODO
 * @Date 2020/5/27 11:04
 * @Created by 86153
 */
object Scala_test03_Map_01 {
  def main(args: Array[String]): Unit = {
    /*
    不可变集合
     */
    val kv = Map("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4)
    /*
    新增
     */
    val map: Map[String, Int] = kv + ("e" -> 5)
    /*
    删除
     */
    val map1: Map[String, Int] = map - "e"
    /*
    修改
     */
    val map2: Map[String, Int] = map1.updated("a", 9)
    println(map1)
    println(map2)

    /*
    获取指定的kay的值
     */
    val option: Option[Int] = map2.get("a")
    println(option)
    println(map2.apply("a"))
    println(map2.get("a"))
    println(map2.getOrElse("a", -1))
    println(map2("a"))
  }
}
