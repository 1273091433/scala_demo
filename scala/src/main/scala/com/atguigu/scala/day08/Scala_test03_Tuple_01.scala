package com.atguigu.scala.day08

/**
 * @Classname Scala_test01_list
 * @Description TODO
 * @Date 2020/5/27 11:04
 * @Created by 86153
 */
object Scala_test03_Tuple_01 {
  def main(args: Array[String]): Unit = {
    /*
    元组
     */
    val tuple: (Int, String, Char) = (1, "zhangsan", 'A')

    val productIterator: Iterator[Any] = tuple.productIterator

    while (productIterator.hasNext){
      println(productIterator.next())
    }
    println(tuple.productElement(0))

    println(tuple)
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
  }
}
