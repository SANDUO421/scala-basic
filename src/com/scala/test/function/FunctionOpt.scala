package com.scala.test.function

/**
  * 功能
  * Scala 中的函数则是一个完整的对象，Scala 中的函数其实就是继承了 Trait 的类的对象。
  * Scala 中使用 val 语句可以定义函数，def 语句定义方法。
  *
  * @author 三多
  * @Time 2019/5/6
  */
object FunctionOpt {
  def main(args: Array[String]): Unit = {

    val ss: Int = m(5)
    println(ss)
    println("Returned Value :" + sum(5, 7))

  }

  /**
    * 定义方法
    *
    * @param x
    * @return
    */
  def m(x: Int) = x + 3;
  //定义函数
  val f = (x: Int) => x + 3;

  /**
    * 求和
    * @param x
    * @param y
    * @return
    */
  def sum(x: Int, y: Int): Int = {
    return x + y
  }

  /**
    * 没有返回值的方法
    */
  def printM(): Unit = {
    println("没有返回值的方法：Hello, Scala!")
  }
}
