package com.scala.test

/**
  * Scala 基础测试类
  * @author 三多
  * @Time 2019/5/6
  */
object BasicOpt {
  def main(args: Array[String]): Unit = {
    var a : Integer = 20;
    var b : Integer = 30;
    var c : Integer = 50;
    //算符运算符
    println("-----------------算符运算符------------------------")
    println("a + b = " + (a + b))
    println("a - b = " + (a - b))
    println("a * b = " + (a * b))
    println("b / a = " + (b / a))
    println("b % a = " + (b % a))
    println("c % a = " + (c % a))
    //关系运算符
    println("-----------------关系运算符------------------------")
    println("a == b = " + a == b)
    println("a != b = " + a != b)
    println("a > b = " + (a > b))
    println("a < b = " + (a < b))
    println("b >= a = " + (b >= a))
    println("b <= a = " + (b <= a))
    //逻辑运算符
    println("-----------------逻辑运算符------------------------")
    val aa = true
    val bb = false

    println("aa && bb = " + (aa && bb))
    println("aa || bb = " + (aa || bb))
    println("!(aa && bb) = " + !(aa && bb))

  }

}
