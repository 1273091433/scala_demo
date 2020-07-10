package com.atguigu.scala.day11

import scala.collection.mutable
import scala.util.matching.Regex

/**
 * @Classname Scala_Test02_Regex
 * @Description TODO
 * @Date 2020/6/1 19:12
 * @Created by 86153
 */
object Scala_Test02_Regex {
  def main(args: Array[String]): Unit = {
    val r: Regex = "^s".r
    val maybeString: Option[String] = r.findFirstIn("qwedasdasdasd")
    if(maybeString.isEmpty){
      //println("未能匹配")
    }else{
      //println("能匹配成功")
    }

    val strings: Array[String] = "123,qweqw&123,qweqw&123,qweqw&123,qweqw&123,qweqw&".split(",|&")
    println(strings.mkString(","))
    //var b:String = 12
    val strings1: List[String] = List[String]()


    /*
    task
     */

    val tokens = "one two three four two two three four".split(" ")
    tokens.foreach(print)
    val map = new mutable.HashMap[String,Int]
    for(key <-tokens){
      map(key) = map.getOrElse(key,0)+1
      print(s"$key    ${map.getOrElse(key, 0) + 1}")
    }
    map.toList.foreach(println)
  }
}
//
