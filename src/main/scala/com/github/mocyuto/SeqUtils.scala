package com.github.mocyuto

import scala.collection.mutable.ArrayBuffer

object SeqUtils {
  implicit class PartMap[A](seq: Seq[A]) {

    /**
     * Apply `f` after Partitions by `p` this Seq[A] in two (Seq[B],Seq[B])
     * @param p the predicate on which to partition.
     * @param f the function that is applied for its side-effect to every element.
     * @return a pair of Seq
     */
    def partitionMap[B](p: A => Boolean)(f: A => B): (Seq[B], Seq[B]) = {
      val l, r = new ArrayBuffer[B]
      for (x <- seq) (if (p(x)) l else r) += f(x)
      (l, r)
    }

    /**
     * Returns Seq value if the Seq is nonempty, otherwise
     * return the result of evaluating `alterSeq`.
     * @param alterSeq the default expression.
     */
    def filledOrElse(alterSeq: => Seq[A]): Seq[A] = {
      if (seq.isEmpty) alterSeq
      else seq
    }

  }
}