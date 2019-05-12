package com.scala.test.accobject

/**
  * 伴生对象，与类名字相同，可以访问类的私有属性和方法
  *
  * @author 三多
  * @Time 2019/5/12
  */
object Marker {

  private val markers: Map[String, Marker] = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )

  def apply(color: String) = {
    if (markers.contains(color)) markers(color) else null
  }


  def getMarker(color: String) = {
    if (markers.contains(color)) markers(color) else null
  }

  def main(args: Array[String]) {
    println(Marker("red"))
    // 单例函数调用，省略了.(点)符号(用空格代替)
    println(Marker getMarker "blue")
    println(markers("green"))
  }

}

// 私有构造方法
class Marker private(val color: String) {

  println("创建" + this)

  override def toString(): String = "颜色标记：" + color

}
