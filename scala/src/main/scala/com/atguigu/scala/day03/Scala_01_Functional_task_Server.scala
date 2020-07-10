package com.atguigu.scala.day03

import java.io.{DataOutputStream, ObjectInputStream}
import java.net.{ServerSocket, Socket}

/**
 * @Classname Scala_01_Functional
 * @Description TODO
 * @Date 2020/5/22 16:38
 * @Created by 86153
 */
object Scala_01_Functional_task_Server {
  def main(args: Array[String]): Unit = {
    /*
    如果一台机器想让另外一台机器执行函数功能怎么办？及一台提供数据，一台提供计算逻辑
    提供数据
     */
    val server = new ServerSocket(9999)
    while (true){
      val socket:Socket = server.accept()
      val stream = new ObjectInputStream(socket.getInputStream)
      val ruleValue = stream.readObject()
      //server的module也要导client端的依赖，因为你接收的number方法是client类的成员方法
      println("===="+ruleValue)
      val intToInt:Int=>Int = ruleValue.asInstanceOf[Int => Int]

     val out = new DataOutputStream(socket.getOutputStream())
      val num:Int =12
      val i1 = numberRule(num, intToInt)
      println("发送客户端结果"+i1)
      out.writeInt(i1)
    }
  }
  def numberRule(num:Int,f:Int=>Int):Int={
    f(num)
  }
}
