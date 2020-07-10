package com.atguigu.scala.day02

/**
 * @Classname Scala_03_Functional
 * @Description TODO
 * @Date 2020/5/20 19:15
 * @Created by 86153
 */
object Scala_03_Functional_02 {
  def main(args: Array[String]): Unit = {
    //函数式编程
    def test():String = {
      "li_si"
    }
    /*
    省略return关键字
     */
    def test01():String = {
      "li_si"
    }

    //println(test01())
    /*
     省略花括号
     */
    def test02():String = "li_si"
    //println(test02())
    /*
    省略返回值
     */
    def test03() = "li_si"
    //println(test03())
    /*
    省略参数列表
     */
    def test04 = "li_si"
    //println(test04)

    /*
      省略等号 ,返回值为()
     */
    def test05(){
      return "li_si"
    }
    //println(test05())
    /*
    省略名称和关键字
     */
    () => println("li_si")
  }
}
