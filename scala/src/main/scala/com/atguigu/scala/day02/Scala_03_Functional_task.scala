package com.atguigu.scala.day02

import scala.collection.immutable.Range

/**
 * @Classname Scala_03_Functional
 * @Description TODO
 * @Date 2020/5/20 19:15
 * @Created by 86153
 */
object Scala_03_Functional_task {
  def main(args: Array[String]): Unit = {
    /*
    函数式编程  作业
     */
    /*
    1. 如果想把一个任意的数字A通过转换后得到它的2倍，那么这个转换的函数应该如何声明和使用
     */
      def test01(num:Int):Int={
        num * 2
    }

    println(test01(3))

    /*
    2. 如果上一题想将数字A转换为任意数据B（不局限为数字），转换规则自己定义，该如何声明
     */
     def test02(f:Int => Any)={
       f(10)
     }
    println(test02(num => "Bind"))
    println(test02(num => 'W'))
    /*
    3. 如果函数调用：  test(10,20,c)的计算结果由参数c(函数)来决定，这个参数c你会如何声明
     */
    def test03(num1:Int,num2:Int,f:Int=>Int):Any={
      if(f(4)<10){
        num1
      }else if(f(6)<20){
        num2
      }else{
        "其他"
      }
    }
    println(test03(10,20,2*_))
    println(test03(10,20,3*_))
    println(test03(10,20,5*_))
    /*
      4. 如果设计一个用于过滤的函数，你会如何做？
      要求：对传递的包含多个单词的字符串参数,根据指定的规则对word进行过滤
      例子："hello world scala spark" => 首写字母为s => "scala, spark"
     */
    def test04(f:String=>String): String ={
      f("hello world scala spark")
    }

    println(test04((str) =>{
      val strings = str.split(" ")
      val result = for (string<- strings ;if string.startsWith("s")) yield {
          string
        }
      result.mkString(",")
    }))

    //println(test04(str => str))

    def test099(f:()=>Int)={

    }
  }
}
