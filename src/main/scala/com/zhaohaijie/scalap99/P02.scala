package com.zhaohaijie.scalap99

object P02{
  def secondLast[A](list: List[A]) : A = {
    Option(list) match {
      case None => throw new NullPointerException("List is Null")
      case l if(l.get.length < 2) => throw new ItemNotAvailableException("Not Enough Item")
      case _ => list(list.length - 2)
    }
  }

  def last[A](list: List[A]) : A = {
    list.last
  }
}

