package com.atguigu.scala.day09

/**
 * @Classname Scala_Test01_Queue
 * @Description TODO
 * @Date 2020/5/29 18:31
 * @Created by 86153
 */
object Scala_Test05_Task {
  def main(args: Array[String]): Unit = {
    /*
    作业 各个省份商品的数据排序
     */
    val list = List(
      ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "鞋"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "鞋"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "鞋"),
      ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "帽子"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "电脑"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "电脑"),
      ("zhangsan", "河南", "电脑"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子")
    )
    //
    val listMap: List[(String, String)] = list.map(
      list => {
        (list._2 + "-" + list._3, list._3)
      }
    )
    val groupByMap: Map[String, List[(String, String)]] = listMap.groupBy(_._1)
    val groupByMaps: Map[String, Int] = groupByMap.map(kv => (kv._1, kv._2.length))

    val mapList: List[(String, Int)] = groupByMaps.toList

    val listMap2: List[(String, (String, Int))] = mapList.map(
      list => {
        val words: Array[String] = list._1.split("-")
        //(words(0),words(1),list._2)
        (words(0), (words(1), list._2))
      }
    )
    val groupMap2: Map[String, List[(String, (String, Int))]] = listMap2.groupBy(_._1)
    val list1: List[(String, List[(String, Int)])] = groupMap2.toList.map(
      list => {
        (list._1, list._2.map(_._2).sortBy(
          sort => {
            sort._2
          }
        )(Ordering.Int.reverse))
      }
    )

    println(groupByMap)
    println(list1)

    println(list1.flatMap(_._2))
  }
}
