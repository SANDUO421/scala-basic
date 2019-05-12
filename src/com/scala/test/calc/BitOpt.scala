package com.scala.test.calc

/**
  * 位运算符
  *
  * @author 三多
  * @Time 2019/5/6
  */
object BitOpt {
  def main(args: Array[String]): Unit = {
    val a = 60
    /* 60 = 0011 1100 */
    val b = 13
    /* 13 = 0000 1101 */
    var c = 0
    c = a & b /* 12 = 0000 1100 */
    println("a & b = " + c)
    c = a | b /* 61 = 0011 1101 */
    println("a | b = " + c)
    c = a ^ b /* 49 = 0011 0001 */
    println("a ^ b = " + c)
    c = ~a /* -61 = 1100 0011 */
    println("~a = " + c)
    c = a << 2 /* 240 = 1111 0000 */
    println("a << 2 = " + c)
    c = a >> 2 /* 15 = 1111 */
    println("a >> 2  = " + c)
    c = a >>> 2 /* 15 = 0000 1111 */
    println("a >>> 2 = " + c)
  }

}
