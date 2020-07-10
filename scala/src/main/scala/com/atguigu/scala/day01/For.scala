package com.atguigu.scala.day01

/**
 * @Classname For
 * @Description TODO
 * @Date 2020/5/19 21:34
 * @Created by 86153
 */
object For {
  def main(args: Array[String]): Unit = {
    //for循环 方式一
    for (i <- 1 to 5){
      //println(i)
    }
    //for循环 方式2
    for (i <- 1 until 5){
      //println(i)
    }
    //for循环 方式3
    for (i <- Range(1,5)){
      //println(i)
    }
    //for循环 方式4 step 步长
    for (i <- 1 to 5 by 2){
      //println(i)
    }
    //for循环 方式5 step 步长
    for (i <- 1 until 5 by 2){
      //println(i)
    }
    //for循环 方式6 step 步长
    for (i <- Range(1,5,2)){
      println(i)
    }

    for ( i <- Range(1,5); j = i - 1 ) {

      println("j = " + j )

    }
    //for循环 方式7 step 步长 九层妖塔
    val num:Int = 9
    for(i <- 1 to 2*num by 2; j = (2*num-i)/2){
      println(" " * j + "*" * i)
    }
  }
}
