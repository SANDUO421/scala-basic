package com.scala.test.condition

/**
  * 条件操作
  *
  * @author 三多
  * @Time 2019/5/6
  */
object ConditionOpt {

  def main(args: Array[String]): Unit = {
    val x = 10
    if (x < 20) {
      println("x 小于 20")
    } else {
      println("x 大于 20")
    }
    val a = 10
    // 无限循环
    while (true)
      println("a 的值为 : " + a)
  }

}
