package com.atguigu.scala.day02

/**
 * @Classname Scala_03_Functional
 * @Description TODO
 * @Date 2020/5/20 19:15
 * @Created by 86153
 */
object Scala_03_Functional_hell {
  def main(args: Array[String]): Unit = {
    //函数式编程  地狱级别
    /*
    函数作为值
     */
    //def test01:String = {
    def test01():String = {
      "zhangsan"
    }
    //val result = test01
    //val result = test01 _
    val result:()=>String = test01
    //println(result())

    /*
      函数作为参数
     */
    def test02(x:Int):Int = {
        x * 2
    }
    def test03(f:(Int) => Int):Int = {
      f(10)
    }

    //println(test03(test02))

    /*
    函数作为返回值
     */
    def test04()={
      test02 _
    }

    //println(test04()(11))

    /*
    匿名函数
     */
    println(test03((x: Int) => {x * x}))
    println(test03((x: Int) => x * x))
    println(test03((x) => x * x))
    println(test03( x => x * x))
    println(test03(  10  * _))


  }
}
