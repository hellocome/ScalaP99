package com.zhaohaijie.scalap99

object P03{
  def nth[A](n: Int, list: List[A]) : A = {
    Option(list) match {
      case None => throw new NullPointerException("List is Null")
      case l if(l.get.length <= n) => throw new ItemNotAvailableException("Not Enough Item")
      case _ => list(n)
    }
  }

  def last[A](list: List[A]) : A = {
    list.last
  }
}