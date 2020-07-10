package com.atguigu.scala.day08

import scala.collection.mutable

/**
 * @Classname Scala_test01_list
 * @Description TODO
 * @Date 2020/5/27 11:04
 * @Created by 86153
 */
object Scala_test06_Test {
  def main(args: Array[String]): Unit = {
    val xs = Map("a" -> List(11,111), "b" -> List(22,222)).flatMap(_._2)
    //println(xs)

    val ys = Map("a" -> List(1 -> 11,1 -> 111), "b" -> List(2 -> 22,2 -> 222)).flatMap(_._2)
    val ys2 = Map("a" -> List(1 -> 11,11 -> 111), "b" -> List(2 -> 22,22 -> 222)).flatMap(_._2)
    //println(ys)
    //println(ys2)

    val lists= List(List(11,111),List(11,111),List(11,111),List(11,111))
    println(lists.flatten)
    //println(lists.flatten(_))
    println(lists.flatten(list=>list))
    val list = List(
      ("hello", List(1,2,3)),
      ("hello spark", List(1,2,3)),
      ("hello spark scala", List(1,2,3)),
      ("hello spark scala hive", List(1,2,3))
    )
/*    println(list.flatMap(_._2))*/
    val list2 = List(
      ("hello", 4),
      ("hello spark", 3),
      ("hello spark scala", 2),
      ("hello spark scala hive", 1)
    )
/*    println(list2.flatMap(
      kv => {
        kv._1.split(" ")
      }
    ))
    println(list2.flatten(
      kv => {
        kv._1.split(" ")
      }
    ))*/
    //println()
    //val wordList: List[String] = Source.fromFile("input/test.txt").getLines().toList
/*    println(wordList.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).map(
      kv => (kv._1,kv._2.length)
    ))*/
    //println(wordList.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).groupBy(_._1).map(t=>(t._1,t._2.size)).toList.sortBy(_._2).reverse)
    val list1 = List(1, 2, 3, 4)

    println(list1.reduce(_ + _))

    println(list1.fold(10)(_+_))
    println(list1.foldLeft("A")(_+_))
    println(list1.foldRight("A")(_+_))

    val str: String = list1.foldRight("A")(_ + _)

    println("str =" + str)

    val map1: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2: mutable.Map[String, Int] = mutable.Map("b" -> 1, "c" -> 2, "d" -> 3)

    println(map1.foldLeft(map2)(
      (map, kv) => {
        //println(kv)
        map(kv._1)=map.getOrElse(kv._1,0)+kv._2
        map
      }
    ))

    println(map2.foldLeft(map1)(
      (map, kv) => {
        map(kv._1)=map.getOrElse(kv._1,0)+kv._2
        map
      }
    ))

    println(map2.fold("g"->6)(
      (map,kv)=>{
        map
      }
    ))


  }
}
