package com.github.mocyuto

import scala.collection.mutable

object MapUtils {

  implicit class tuple2map[A, B](tupleSeq: Seq[(A, B)]) {

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
