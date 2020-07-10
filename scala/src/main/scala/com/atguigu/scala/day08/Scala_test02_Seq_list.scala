package com.atguigu.scala.day08

/**
 * @Classname Scala_test01_list
 * @Description TODO
 * @Date 2020/5/27 11:04
 * @Created by 86153
 */
object Scala_test02_Seq_list {
  def main(args: Array[String]): Unit = {
    /*
    不可变集合
     */
/*    val list = List(1, 2, 3, 4, 5)

    val list1: List[Int] = list :+ 1

    println(list1)

    list1.foreach(println)

    val list2: List[Int] = list.updated(1, 5)

    println(list2)

    val bool: Boolean = list2 eq list

    println(bool)*/

    /*
    创建集合
     */
    val list = List(List(List(1,2,3,4),List(5,6,7,8)))
    val nil: Nil.type = Nil

    println(list eq list)

    val list1: List[Int] = 1 :: 2 :: 3 :: 4 :: Nil
    println(list1)
    val list2: List[Int] = 1 :: 23 :: 4 :: 8 :: Nil
    println(list2)
    val list3: List[Int] = 1 :: 23 :: 4 :: 8 :: list1
    println(list3)

    val list4: List[Any] = 10 :: 11 :: list

    println(list4)

    // 连接集合

    val list5: List[Int] = List.concat(list2, list3)

    val str = list2 ++ list3

    println(list5)

    println(str)

    val list6: List[Int] = List.fill[Int](4)(-1)
    println(list6)

  }
}
