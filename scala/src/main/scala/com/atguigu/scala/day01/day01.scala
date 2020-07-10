package com.atguigu.scala.day01

import scala.io.Source
import scala.runtime.Nothing$

/**
 * @Classname day01
 * @Description TODO
 * @Date 2020/5/19 8:49
 * @Created by 86153
 */
object day01 {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("input/test.txt")
    val strings = source.getLines()
    while (strings.hasNext){
      println(strings.next())
    }
    //var ii:Int = null
    val c:Char = 'A'

    var d : Int = c +1
    println(d )
    //val e : Char = c + 1
    //println(e )
    val list2: List[Nothing] = List()
  }
}
