package com.github.mocyuto

import scala.collection.mutable.ArrayBuffer

class SeqUtils {
  implicit class PartMap[A](seq: Seq[A]) {

    def partitionMap[B](p: A => Boolean)(f: A => B): (Seq[B], Seq[B]) = {
      val l, r = new ArrayBuffer[B]
      for (x <- seq) (if (p(x)) l else r) += f(x)
      (l, r)
    }
  }
}