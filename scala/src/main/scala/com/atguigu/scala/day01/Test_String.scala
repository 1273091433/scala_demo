package com.atguigu.scala.day01

/**
 * @Classname Test_String
 * @Description TODO
 * @Date 2020/5/19 21:14
 * @Created by 86153
 */
object Test_String {
  def main(args: Array[String]): Unit = {
    //字符串拼接
    val name:String = "xiao_ming"
    val age:Int = 20

    printf(s"name is %s,age is %s \n",name,age)

    println(s"name is $name,age is $age")

    println(s"name is $name,age is ${age+3}")

    println(
      s"""
        |name is $name,age is $age
        |""".stripMargin)
  }
}
