package com.scala.test.exception

import java.io.{FileNotFoundException, FileReader, IOException}

/**
  * 异常捕获
  *
  * @author 三多
  * @Time 2019/5/12
  */
object ExceptionTest {
  def main(args: Array[String]): Unit = {

    try{
      val f = new FileReader("input.txt")
    }catch{
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException =>{
        println("IO Exception")
      }
    }finally {
      println("Exiting finally...")
    }
  }
}
