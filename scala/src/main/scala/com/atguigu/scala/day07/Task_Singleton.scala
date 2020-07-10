package com.atguigu.scala.day07

/**
 * @Classname Task_Singleton
 * @Description TODO
 * @Date 2020/5/26 19:39
 * @Created by 86153
 */
object Task_Singleton  {
  def main(args: Array[String]): Unit = {
    val user0: Task_User04.type = Task_User04
    val user1: Task_User04.type = Task_User04
    println(user0 eq user1)
  }
}
/*
  单例模式
 */
class Task_User04 private(){

}

object Task_User04{
  val user:Task_User04 = new Task_User04()
  def apply(): Task_User04 = user
}