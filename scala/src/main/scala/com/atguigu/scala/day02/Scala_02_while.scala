package com.atguigu.scala.day02

import scala.util.control.Breaks

/**
 * @Classname scala_01_for
 * @Description TODO
 * @Date 2020/5/20 18:51
 * @Created by 86153
 */
object Scala_02_while {
  def main(args: Array[String]): Unit = {
    /*
      break 1 跳出循环,底层原理：Java的异常
     */
/*    for (i <- 1 to 5){
      //println(i)
      if(i == 3){
        Breaks.break()
      }
    }*/
    /*
      break 2 跳出循环,底层原理：Java的异常
     */
    Breaks.breakable{
      for (i <- 1 to 5){
        println(i)
        if(i == 3){
          Breaks.break()
        }
      }
    }
  }
}
