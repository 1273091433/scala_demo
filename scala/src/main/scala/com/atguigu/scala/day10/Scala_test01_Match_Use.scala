package com.atguigu.scala.day10

/**
 * @Classname Scala_test01_Match
 * @Description TODO
 * @Date 2020/5/30 13:43
 * @Created by 86153
 */
object Scala_test01_Match_Use {
  def main(args: Array[String]): Unit = {
    /*
    模式匹配 的应用
     */
    var (x,y) = (1,2)
    //println(s"x is ${x} y is ${y}")

    val Array(first, second, _*) = Array(1, 7, 2, 9)
    //println(s"first=$first,second=$second")

    val map = Map("A" -> 1, "B" -> 0, "C" -> 3)
    for((k,v) <- map){
      //println(s"k is $k v is $v")
    }

    for((k,0) <- map){
      //println(s"2---k is $k v is 0")
    }

    for((k,v) <- map if v>0){
      //println(s"3---k is $k v is $v")
    }
    /*
    函数参数
     */
    val list = List(
      ("a", 1), ("b", 2), ("c", 3)
    )
    val list1: List[(String, Int)] = list.map {
      case (k, v) =>
        (k, 2 * v)
    }
    //println(list1)
    /*
    偏函数
     */
    def fun1:PartialFunction[Int,String] = {case 1 => "one"}

    val ints = List(1, 2, 3, 4)
    val ints2 = List(1, 2, 3, 4,"test")

    //println(ints.collect(fun1))
    ints2.collect{case i:Int => i+1}.foreach(println)
    ints2.collect{case s:String => s*2}.foreach(println)
  }
}