package com.atguigu.scala.day08
import scala.collection.mutable
/**
 * @Classname Scala_test01_list
 * @Description TODO
 * @Date 2020/5/27 11:04
 * @Created by 86153
 */
object Scala_test05_Task {
  def main(args: Array[String]): Unit = {
    /*
    List(
         ("hello", 4),
         ("hello spark", 3),
         ("hello spark scala", 2),
         ("hello spark scala hive", 1)
     )
     将上面的数据进行WordCount后排序取前三名！
     */
    val list = List(
      ("hello", 4),
      ("hello spark", 3),
      ("hello spark scala", 2),
      ("hello spark scala hive", 1)
    )
    /*
    方式一
     */
    println("方式一")
    //第一步 分词 ("hello spark", 3) -> ("hello",3),("spark",3)
    val listMap: List[(String, Int)] = list.flatMap(
      kv => {
        val strings: Array[String] = kv._1.split(" ")
        val map: mutable.Map[String, Int] = mutable.Map()
        /*strings.foreach((s: String) => {
          map.put(s, kv._2)
        })*/
        strings.foreach(map.put(_, kv._2))
        map
      }
    )
    //println(listMap)
    //第二步 分组 ("hello",3),("hello",3) -> ("hello")->(("hello",3),("hello",3))
    val groupByMap= listMap.groupBy(
      word => word._1
    )
    //println(groupByMap)
    //第三步求和 ("hello",5)
    val listCountMap: Map[String, Int] = groupByMap.map(
      kv => {
        var sum: Int = 0
        kv._2.foreach((kv) => {
          sum += kv._2
        })
        (kv._1, sum)
      }
    )
    //println(listCountMap)
    //第四步 排序 按照 数目排序
    val sortList: List[(String, Int)] = listCountMap.toList.sortBy(_._2)(Ordering.Int.reverse)
    //第五步取出top3
    val result: List[(String, Int)] = sortList.take(3)
    println(result)

    /*
    方式二
     */
    println("方式二")
    //第一步 数据整理，制造冗余数据  ("hello", 4) -> ("hello hello hello hello")
    val listMap2: List[String] = list.map(
      map => {
        ((map._1+" ") * map._2)
      }
    )
    //第二步 ("hello hello hello hello") 切词  ("hello","hello","hello","hello")
    val listFlatMap2: List[String] = listMap2.flatMap(
      word => word.split(" ")
    )
    //第三步 分组 spark -> List(spark, spark, spark, spark, spark, spark)
    val groupByMap2: Map[String, List[String]] = listFlatMap2.groupBy(
      word => word
    )
    /*val groupByMap3: Map[String, List[String]] = listFlatMap2.groupBy(word => word)
    println(groupByMap3)*/
    //第四步 统计数据
    val countMap2: Map[String, Int] = groupByMap2.map(
      kv => (kv._1, kv._2.length)
    )
    //第五步 排序
    val sortList2: List[(String, Int)] = countMap2.toList.sortBy(_._2)(Ordering.Int.reverse)
    //第六步 top3
    val result2: List[(String, Int)] = sortList2.take(3)
    println(result2)

  }
}
