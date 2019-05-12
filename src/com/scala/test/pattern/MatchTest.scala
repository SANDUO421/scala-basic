package com.scala.test.pattern

/**
  * 模式匹配
  *
  * @author 三多
  * @Time 2019/5/12
  */
object MatchTest {
  def main(args: Array[String]): Unit = {
    println(matchMethod(3))
    //匹配各种类型
    println(matchMethod2("two"))
    println(matchMethod2("test"))
    println(matchMethod2(1))
    println(matchMethod2(6))
  }

  def matchMethod(x: Int): String = x match {
    case 1 => "run"
    case 2 => "jump"
    case _ => "fly"
  }

  def matchMethod2(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"
  }
}
