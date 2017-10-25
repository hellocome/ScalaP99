package com.zhaohaijie.scalap99

object P01{
  def last[A](list: List[A]) : A = {
    Option(list) match {
      case Some(Nil) => throw new ItemNotAvailableException()("Empty List")
      case None => throw new NullPointerException("List is Null")
      case _ => list(list.length - 1)
    }
  }
}
