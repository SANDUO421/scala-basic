package com.scala.test.traits

/**
  *
  * @author 三多
  * @Time 2019/5/12
  */
trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}
