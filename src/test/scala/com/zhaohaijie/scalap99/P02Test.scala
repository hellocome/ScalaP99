package com.zhaohaijie.scalap99

import com.zhaohaijie.scalap99.P02.secondLast
import junit.framework.Assert._
import org.junit._
import org.scalatest.junit.JUnitSuite

class P02Test extends JUnitSuite{

  @Test
  def secondLastTest1(): Unit ={
    val lastNum = secondLast(List(1,2,3,4,5))
    assertEquals(4,lastNum)
  }

  @Test
  def secondLastTest2(): Unit ={
    val lastNum = secondLast(List(1,2))
    assertEquals(1,lastNum)
  }

  @Test
  def secondLastTest3(): Unit ={
    try {
      val lastNum = secondLast(List(1))
    }catch{
      case _: ItemNotAvailableException =>
    }
  }

  @Test
  def secondLastTest4(): Unit ={
    try {
      val lastNum = secondLast(List())
    }catch{
      case _: ItemNotAvailableException =>
    }
  }

  @Test
  def secondLastTest5(): Unit ={
    try {
      val lastNum = secondLast(null)
    }catch{
      case _: NullPointerException =>
    }
  }
}