package com.scala.test.fileIo

import java.io._

import scala.io.{Source, StdIn}

/**
  * 文件测试
 *
  * @author 三多
  * @Time 2019/5/12
  */
object FileTest {

  def main(args: Array[String]) {
    val writer = new PrintWriter(new File("test.txt" ))

    writer.write("菜鸟教程")
    writer.close()

    print("请输入菜鸟教程官网 : " )
    val line = StdIn.readLine()

    println("谢谢，你输入的是: " + line)

    println("文件内容为:" )

    Source.fromFile("test.txt" ).foreach{
      print
    }
  }

}
