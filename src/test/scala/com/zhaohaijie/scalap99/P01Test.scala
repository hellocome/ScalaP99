package com.zhaohaijie.scalap99

import com.zhaohaijie.scalap99.P01.last
import junit.framework.Assert._
import org.junit._
import org.scalatest.junit.JUnitSuite

class P01Test extends JUnitSuite{

  @Test
  def lastTest1(): Unit ={
    val lastNum = last(List(1,2,3,4,5))
    assertEquals(5,lastNum)
  }

  @Test
  def lastTest2(): Unit ={
    val lastNum = last(List(1))
    assertEquals(1,lastNum)
  }

  @Test
  def lastTest3(): Unit ={
    try {
      val lastNum = last(List())
    }catch{
      case _: ItemNotAvailableException =>
    }
  }

  @Test
  def lastTest4(): Unit ={
    try {
      val lastNum = last(null)
    }catch{
      case _: NullPointerException =>
    }
  }
}