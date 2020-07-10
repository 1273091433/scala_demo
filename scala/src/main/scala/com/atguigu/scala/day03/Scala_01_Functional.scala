package com.atguigu.scala.day03

/**
 * @Classname Scala_01_Functional
 * @Description TODO
 * @Date 2020/5/22 16:38
 * @Created by 86153
 */
object Scala_01_Functional {
  def main(args: Array[String]): Unit = {
    /*
    递归
     */
    def test01(num:Int): Int ={
      if(num<1){
        1
      }else{
        num * test01(num-1)
      }
    }

    def test011(num:Int,result:Int): Int ={
      if(num<1){
        result
      }else{
        test011(num-1,num*result)
      }
    }

    println(test01(5))
    println(test011(5,1))
    /*
    尾递归
     */
    def test02(num:Int): Int ={
      if(num<1){
        1
      }else{
        num + test02(num-1)
      }
    }
    def test021(num:Int,result:Int): Int ={
      if(num<1){
        result
      }else{
        test021(num-1,num+result)
      }
    }

    println(test02(5))
    println(test021(5,1))
  }
}
