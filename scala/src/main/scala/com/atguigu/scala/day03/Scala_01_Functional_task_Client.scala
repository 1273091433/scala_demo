package com.atguigu.scala.day03

import java.io.{DataInputStream, ObjectOutputStream, PrintWriter}
import java.net.Socket

import com.alibaba.fastjson.JSONObject

/**
 * @Classname Scala_01_Functional_task_Clien
 * @Description TODO
 * @Date 2020/5/22 18:27
 * @Created by 86153
 */
object Scala_01_Functional_task_Client {
  def main(args: Array[String]): Unit = {
    /*
   如果一台机器想让另外一台机器执行函数功能怎么办？及一台提供数据，一台提供计算逻辑
   计算逻辑
    */
    val socket = new Socket("localhost",9999)
    //val writer = new PrintWriter(socket.getOutputStream)
    val stream = new ObjectOutputStream(socket.getOutputStream)
    val in: DataInputStream = new DataInputStream(socket.getInputStream)
    val json:JSONObject = new JSONObject()
    json.put("rule","def number(num:Int):Int={    2 * num  }")

    stream.writeObject(number _)
    stream.flush()
    val result: Int = in.readInt()
    println("服务端返回结果：" + result)
    in.close()
    stream.close()
    socket.close()
  }
  def number(num:Int):Int={    2 * num  }
}
