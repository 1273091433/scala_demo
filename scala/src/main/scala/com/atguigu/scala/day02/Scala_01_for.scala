package com.atguigu.scala.day02

/**
 * @Classname scala_01_for
 * @Description TODO
 * @Date 2020/5/20 18:51
 * @Created by 86153
 */
object Scala_01_for {
  def main(args: Array[String]): Unit = {
    /*
    跳过条件
     */
    for(i <- 1 to 10 by 2 ; if i!=3){
      //println(i)
    }

    /*
    循环嵌套 1
     */
    for(i <- 1 to 10 by 2 ){
      for (j <- 1 to 5){
        //println(i+","+j)
      }
    }

    /*
    循环嵌套 2
     */
    for(i <- 1 to 10 by 2 ;j <- 1 to 5){
        //println(i+","+j)
    }

    /*
    引入变量
     */
    for(i <- 1 to 5;j = 5-i){
      //println(i+","+j)
    }

    /*
    一个循环搞定 九层妖塔
     */
    for(i <- 1 to 18 by 2;j = (18-i)/2){
      //println(" " * j + "*" * i)
    }

    /*
      循环返回值,返回有向集合
     */
    val result = for(i <- 1 to 5;j = 5-i) yield {
      i
    }
    println(result)
  }
}
