package com.atguigu.scala.day11

/**
 * @Classname Scala_test01_Generic
 * @Description TODO
 * @Date 2020/6/1 17:42
 * @Created by 86153
 */
object Scala_test01_Generic {
  def main(args: Array[String]): Unit = {
    /*
    泛型不可变
     */
    /*val person:Test[User] = new Test[Person]//error
    val person:Test[User] = new Test[User] //ok
    val person:Test[User] = new Test[SuperUser] //error*/
    /*
    泛型的协变
     */
/*    val person:Test[User] = new Test[Person]
    val person:Test[User] = new Test[User]
    val person:Test[User] = new Test[SuperUser]*/
    /*
    泛型的逆变
     */
    /*val person:Test[User] = new Test[Person]
    val person:Test[User] = new Test[User]
    val person:Test[User] = new Test[SuperUser]*/
    /*
    泛型边界 上线 <:/ 下限 >:
     */
    /*def test[T <: User](t : T): Unit ={

    }*/
    /*def test[T >: User](t : T): Unit ={

    }

    val user01 = new User
    val person01 = new Person
    val superUser01 = new SuperUser

    test[User](user01)
    test[Person](person01)
    test[SuperUser](superUser01)*/

  }
  class Test[T]{

  }
  class Person{

  }
  class User extends Person{

  }
  class SuperUser extends User{

  }
}
