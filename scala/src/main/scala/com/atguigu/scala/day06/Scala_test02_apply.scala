package com.atguigu.scala.day06

/**
 * @Classname Scala_test01
 * @Description TODO
 * @Date 2020/5/25 9:18
 * @Created by 86153
 */
object Scala_test02_apply {

  def main(args: Array[String]): Unit = {
    val user0 = new User01
    println(user0+"    "+user0.name)
    val user03 = new User01("lisi")
    println(user03+"    "+user03.name)
    val user01 = User01.apply()
    println(user01+"    "+user01.name)
    val user02 = User01("zhangsan")
    println(user02+"    "+user02.name)
  }
}

class User01 (){
  println("User01")
  var name:String = _
  def this (name1:String){
    this()
    println("name    ....."+ name1)
    name = name1
  }
}
object User01{
  def apply(): User01 = new User01()
  def apply(name:String): User01 = new User01(name)
}

