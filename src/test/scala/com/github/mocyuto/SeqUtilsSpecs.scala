package com.github.mocyuto

import org.scalatest.{ FlatSpec, Matchers }
import com.github.mocyuto.SeqUtils._

class SeqUtilsSpecs extends FlatSpec with Matchers {

  it should "not throw Exception" in {
    Seq(1).emptyOrElse(throw new Exception) shouldBe Seq(1)
  }

  it should "throw Exception" in {
    val ex = new Exception
    val thrown = the[Exception] thrownBy (Nil.emptyOrElse(throw ex))
    thrown shouldBe ex
  }
}