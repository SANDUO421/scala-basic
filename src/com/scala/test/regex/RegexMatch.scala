package com.scala.test.regex
import scala.util.matching.Regex

/**
  * 正则匹配
  * @author 三多
  * @Time 2019/5/12
  */
object RegexMatch {

  def main(args: Array[String]): Unit = {
    val pattern = "Scala".r
    val pat = new  Regex("[a-zA-Z]*[0-9]*")
    val str = "Scala is Scalable and cool"
    val str2 = "12331378976540Admin1234"
    val str3 = "Admin1234"
    println(pattern findFirstIn str)
    println(pat.findAllIn(str2).mkString(","))
    println(pat.findAllIn(str2).mkString(",").length)
    println(pat.findAllIn(str2).mkString(",").split(",").length)
    println(pat.findAllIn(str2).mkString(",").split(","))
    val ss: Array[String] = pat.findAllIn(str2).mkString(",").split(",")
    println(ss.apply(1))
    val strings = pat.findAllIn(str3).mkString(",").split(",")
    println(strings.apply(0))
  }
}
