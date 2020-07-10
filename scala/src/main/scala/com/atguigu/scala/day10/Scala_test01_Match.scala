package com.atguigu.scala.day10

/**
 * @Classname Scala_test01_Match
 * @Description TODO
 * @Date 2020/5/30 13:43
 * @Created by 86153
 */
object Scala_test01_Match {
  def main(args: Array[String]): Unit = {
    /*
    模式匹配
     */
/*    val i:Int = 10
    val result: Unit = i match {
      case 10 => println("10")
      case 20 => println("20")
      case _ => println("other")
    }*/
    //result
    val a:Int = 10
    val b:Int = 20
    val option:String = "+"

    val optionValue: Any = option match {
      case "+" => a + b
      case "-" => a - b
      case "*" => a * b
      case "/" => a / b
      case _ => "illegal"
    }
    //println(optionValue)
    /*
    常量匹配
     */
/*    def describe(x: Any) = x match {
      case 5 => "Int five"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "Char +"
      case _ => "other"
    }*/
    /*
    匹配类型
     */
    /*def describe(x: Any) = x match {
      case i:Int => "Int"
      case i:List[Int] => "List"
      case s:String => "String"
      case a:Array[String] => "Array"
      case someThing  => "someThing =" + someThing
    }*/
    /*
    匹配数组
     */
    /*for (arr <- Array(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(1, 1, 0, 1),
      Array("hello", 90))) { // 对一个数组集合进行遍历
      val result: String = arr match {
        case Array(0) => "0"
        case Array(x, y) => " x " + x + " y " + y
        case Array(_, 0) => "0 结尾 的二元数组"
        case Array(0, _*) => " 0 开头的多个元素"
        case _ => "其他"
      }
      println(result)
    }*/

    /*for (list <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0), List(88))) {
      val result = list match {
        case List(0) => "0" //匹配List(0)
        case List(x, y) => x + "," + y //匹配有两个元素的List
        case List(0, _*) => "0 ..."
        case List(_*, 1) => "1结尾 ..."
        case _ => "something else"
      }

      println(result)
    }
    val list: List[Int] = List(1, 2, 5, 6, 7)

    list match {
      case first :: second :: rest => println(first + "-" + second + "-" + rest)
      case _ => println("something else")
    }*/

    /*
    匹配元组
     */
/*    for (tuple <- Array((0, 1), (1, 0), (1, 1), (1, 0, 2))) {
      val result: String = tuple match {
        case (0, _) => "0 开始"
        case (_, 0) => "0 结束"
        case (1, _) => "1 开始"
        case (_, 1) => "1 结束"
        //case (_*, 1) => "1 结束"
        case someThing => "other"
      }
      println(result)
    }*/
    /*
    匹配对象
     */
    /*val user100: User1001 = User1001("lisi", 12)

    val result: String = user100 match {
      case User1001("lisi2", 12) => "true"
      case _ => "false"
    }*/
    /*
    样例类
     */
    val user100: User1002 = User1002("zhangsan", 21)
    val result: String = user100 match {
      case User1002("zhangsan", 21) => "yes"
      case _ => "no"
    }
    println(result)
  }


}
class User1001(var username:String,var age:Int){

}

object User1001{
  def apply(username: String, age: Int): User1001 = new User1001(username, age)

  def unapply(user: User1001): Option[(String, Int)] = {
    if(User1001 == null) {
      None
    }else{
        Some(user.username,user.age)
      }
    }
}
case class User1002(name: String, age: Int)
