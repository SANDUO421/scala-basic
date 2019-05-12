package com.scala.test.pattern

/**
  * 样例类
  * 构造器的每个参数都成为val，除非显式被声明为var，但是并不推荐这么做；
  * 在伴生对象中提供了apply方法，所以可以不使用new关键字就可构建对象；
  * 提供unapply方法使模式匹配可以工作；
  * 生成toString、equals、hashCode和copy方法，除非显示给出这些方法的定义。
  *
  * @author 三多
  * @Time 2019/5/12
  */
object MatchClass {

  def main(args: Array[String]) {
    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)
    val sanduo: Person = Person("sanduo",27);

    for (person <- List(alice, bob, charlie,sanduo)) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) =>
          println("Age: " + age + " year, name: " + name + "?")
      }
    }

  }
}

//样例类
case class Person(name:String,age:Int)

