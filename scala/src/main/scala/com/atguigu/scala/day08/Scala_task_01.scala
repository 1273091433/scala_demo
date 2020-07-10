package com.atguigu.scala.day08

import scala.io.Source

/**
 * @Classname Scala_task_01
 * @Description TODO
 * @Date 2020/5/27 17:46
 * @Created by 86153
 */
object Scala_task_01 {
  def main(args: Array[String]): Unit = {
    //获取数据源
    val wordList: List[String] = Source.fromFile("input/test.txt").getLines().toList
    //切词
    val wordFlatMap: List[String] = wordList.flatMap(
      word => {
        word.split(" ")
      }
    )
    //分组
    val wordGroup: Map[String, List[String]] = wordFlatMap.groupBy(
      word => word
    )
    //计算数据count
    val wordGroupMap: Map[String, Int] = wordGroup.map(
      kv => (kv._1, kv._2.length)
    )
    //排序
    val sortMap: List[(String, Int)] = wordGroupMap.toList.sortBy(
      kv => kv._2
    )(Ordering.Int.reverse)
    //取出top3
    val result: List[(String, Int)] = sortMap.take(3)

    println(result)
    println(sortMap.takeRight(3))
  }
}
