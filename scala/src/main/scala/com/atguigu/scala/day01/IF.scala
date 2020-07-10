package com.atguigu.scala.day01

/**
 * @Classname IF
 * @Description TODO
 * @Date 2020/5/19 21:24
 * @Created by 86153
 */
object IF {
  def main(args: Array[String]): Unit = {
    val age:Int = 20

    //单分支
    if(age<20){
      println("少年")
    }
    //双分支
    if(age<20){
      println("少年")
    }else{
      println("非少年")
    }
    //多分支
    if(age<20){
      println("少年")
    }else if(age<45){
      println("青年")
    }else{
      println("老年")
    }

    //带返回值
    val ageFlag = if(age<20){
      "少年"
    }else if(age<45){
      2
    }else{
      "老年"
    }
    println("带返回值...."+ageFlag)

    //类似三目运算符
    val result = if(age<20){
      "少年"
    }else{
      "非少年"
    }
    println("类似三目运算符.."+result)
    val result01 = if(age<20) "少年" else "非少年"
    println("类似三目运算符简写.."+result01)

    def test1="123"
    println(test1)

    val a = () => 12
    println(a())

    def fun11() ={
      "zhuangshuai000000"
    }

    val f3: () => String = fun11
    println(f3())
  }
}
