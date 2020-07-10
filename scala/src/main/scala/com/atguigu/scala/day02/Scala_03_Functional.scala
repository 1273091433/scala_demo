package com.atguigu.scala.day02

/**
 * @Classname Scala_03_Functional
 * @Description TODO
 * @Date 2020/5/20 19:15
 * @Created by 86153
 */
object Scala_03_Functional {
  def main(args: Array[String]): Unit = {
    //函数式编程
    /*
      基本语法
      [修饰符] def 函数名 ( 参数列表 ) [:返回值类型] = {
          函数体
      }
     */
    /*
      无参，无返回值
     */
    def test01():Unit ={
      //println("函数式编程基本语法:无参，无返回值")
    }
    test01()

    /*
      无参，有返回值
     */
    def test02() :String = {
      "zhangsan"
    }
    //println(test02)

    /*
      有参，无返回值
     */
    def test03(name:String):Unit = {
        name
    }

    //println(test03("lisi"))

    /*
      有参，有返回值
     */
    def test04(name:String):String = {
      "有参，有返回值,"+name
    }

    //println(test04("lisi"))
    /*
      多参，无返回值
     */
    def test05(name:String,age:Int):Unit = {
      "11111111"
    }

    //println(test05("zhangsan", 12))
    /*
      多参，有返回值
     */

    def test06(name:String,age:Int):String={
      name+","+age
    }

    //println(test06("lisi", 20))
    /*
      可变参数
     */
    def test07(name:String*) = {
      println(name)
    }
    //test07("1111111")
    def test08(age:Int,name:String*) = {
      println(age)
      println(name)
    }
    //test08(12,"zhangsan","lisi")
    /*
      默认值
     */
    def test09(age:Int=100,name:String="zhangsan") = {

      println(age)
      println(name)
    }

    //test09(name="lisi")
    //test09(12)
    //test09(12,"lisi")
    /*
      带名参数
     */
    //test09(,name="lisi",age=12)
  }
}
