package com.scala.test.traits

/**
  *
  * @author 三多
  * @Time 2019/5/12
  */
class Point(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any) =
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x
}
