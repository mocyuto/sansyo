package com.github.mocyuto

import scala.collection.mutable

object MapUtils {

  implicit class tuple2map[A, B](tupleSeq: Seq[(A, B)]) {

    /**
     * a tuple Seq change to Map
     * {{{
     *  val seq = Seq((1,2),(2, 3),(1,3))
     *  seq.grouping() // Map(2 -> Seq(3), 1 -> Seq(2, 3))
     * }}}
     *
     * @return a new map keys grouped to Seq
     */
    def grouping(): Map[A, Seq[B]] = {
      val muteMap = mutable.Map[A, Seq[B]]()
      tupleSeq.foreach {
        case (t1, t2) =>
          val seq = if (muteMap.contains(t1)) muteMap(t1) :+ t2 else Seq(t2)
          muteMap += t1 -> seq
      }
      muteMap.result().toMap
    }
  }
}
