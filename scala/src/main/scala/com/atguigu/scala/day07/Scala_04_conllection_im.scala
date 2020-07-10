package com.atguigu.scala.day07

/**
 * @Classname Scala_04_conllection_im
 * @Description TODO 不可变集合
 * @Date 2020/5/26 20:09
 * @Created by 86153
 */
object Scala_04_Conllection_im {
  def main(args: Array[String]): Unit = {
    /*
      创建不可变数组
     */
    val value: Array[Int] = new Array[Int](5)
    /*
      赋值
     */
    value(0)=0
    value(1)=1
    value(2)=2
    value(3)=3
    value(4)=4
    value.update(1,10)

    println("===============")
    println("111"+(value :+ 10).mkString(","))   //...10
    println("111"+(10 +: value).mkString(","))   //10 ...
    println("111"+(value.:+(10)).mkString(","))  //...10
    println("111"+(value.+:(10)).mkString(","))   // 10 ...
    println("===============")

    println(value.mkString(","))
    val ints: Array[Int] = value.+:(10)
    println("111"+(value :+ 10).mkString(","))
    println("111"+(10 +: value).mkString(","))
    val ints1: Array[Int] = value.:+(11)
    println(ints.mkString(","))
    println(ints1.mkString(","))

    for(i <- value){
      println("i .."+ i)
    }

    val arr8:Array[Int] = Array.fill[Int](5)(-1)
    arr8.foreach(println)

    Set(1,2,3)
  }
}
