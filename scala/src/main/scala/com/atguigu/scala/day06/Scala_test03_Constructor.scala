package com.atguigu.scala.day06

/**
 * @Classname Scala_test01
 * @Description TODO
 * @Date 2020/5/25 9:18
 * @Created by 86153
 */
object Scala_test03_Constructor {

  def main(args: Array[String]): Unit = {
    /*val person = new Person
    val person1 = new Person("lile")
    val person2 = new Person("lisi",20)*/

    //val emp3 = new Emp("lisi")
    val emp1 = new Emp()
  }
}

class Person(){
  println("   ...")
  var name:String = _
  var age:Int = _
  def this(name:String){
    this
    this.name = name
    println(" 1  ...")
  }
  def this(name:String,age:Int){
    this(name)
    this.name = name
    this.age = age
    println(" 2  ...")
  }
}

class Emp3 private(var name:String,var age:Int){
  println("2")
  def this(){
    this("zhangsan",20)

    println("0")
  }
  def this(name:String){
    this()
    this.name = name
    println("1")
  }
}