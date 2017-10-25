package com.zhaohaijie.scalap99

import com.zhaohaijie.scalap99.P03.nth
import junit.framework.Assert._
import org.junit._
import org.scalatest.junit.JUnitSuite

class P03Test extends JUnitSuite{

  @Test
  def secondLastTest1(): Unit ={
    val lastNum = nth(0, List(1,2,3,4,5))
    assertEquals(1,lastNum)
  }

  @Test
  def secondLastTest1(): Unit ={
    val lastNum = nth(1, List(1,2,3,4,5))
    assertEquals(2,lastNum)
  }

  @Test
  def secondLastTest1(): Unit ={
    val lastNum = nth(4, List(1,2,3,4,5))
    assertEquals(5,lastNum)
  }

  @Test
  def secondLastTest1(): Unit ={
    try {
      val lastNum = nth(5, List(1,2,3,4,5))
    }catch{
      case _: ItemNotAvailableException =>
    }
  }

  @Test
  def secondLastTest2(): Unit ={
    val lastNum = nth(List(1,2))
    assertEquals(1,lastNum)
  }

  @Test
  def secondLastTest3(): Unit ={
    try {
      val lastNum = nth(List(1))
    }catch{
      case _: ItemNotAvailableException =>
    }
  }

  @Test
  def secondLastTest4(): Unit ={
    try {
      val lastNum = nth(List())
    }catch{
      case _: ItemNotAvailableException =>
    }
  }

  @Test
  def secondLastTest5(): Unit ={
    try {
      val lastNum = nth(null)
    }catch{
      case _: NullPointerException =>
    }
  }
}