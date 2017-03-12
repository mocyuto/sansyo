package com.github.mocyuto

import org.scalatest.{ FlatSpec, Matchers }
import com.github.mocyuto.SeqUtils._

class SeqUtilsSpecs extends FlatSpec with Matchers {

  "Non empty Seq" should "return by oneself" in {
    assert(Seq(1).emptyOrElse(Seq(0)) == Seq(1))
  }

  it should "not throw Exception" in {
    Seq(1).emptyOrElse(throw new Exception) shouldBe Seq(1)
  }

  "Empty Seq" should "return argument" in {
    assert(Seq[Int]().emptyOrElse(Seq(0)) == Seq(0))
  }

  it should "throw Exception" in {
    assertThrows[Exception] {
      Nil.emptyOrElse(throw new Exception)
    }
  }

  "Non empty List" should "return by oneself" in {
    assert(List(1).emptyOrElse(List(0)) == List(1))
  }

  "partitionMap" should "two Seq tuple" in {
    Seq(1, 2, 3).partitionMap(_ > 1)(_ + 1) shouldBe (Seq(3, 4), Seq(2))
  }
}