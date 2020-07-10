package com.atguigu.scala.day07

/**
 * @Classname Scala_test03_trait
 * @Description TODO
 * @Date 2020/5/26 12:16
 * @Created by 86153
 */
object Scala_test03_trait {
  def main(args: Array[String]): Unit = {
    //初始化顺序 从左到右
    //执行顺序 从右到左
    val opt0 = new opt03
    opt0.opt()

    Array(1,2,3,4,5)
  }
}

trait opt01{
  println("opt01")
  def opt():Unit={
    println("开始操作 ")
  }
}
trait DBOpt01 extends opt01{
  println("DBOpt01")
  override def opt():Unit={
    println("数据库.. ")
    //super.opt()
    super[opt01].opt()
  }
}

class MySQLOpt01 extends opt01{
  println("MySQLOpt01")
  override def opt(): Unit ={
    println("mysql... ")
    super.opt()

  }
}

class opt03 extends MySQLOpt01 with DBOpt01{
  println("opt03")
}


