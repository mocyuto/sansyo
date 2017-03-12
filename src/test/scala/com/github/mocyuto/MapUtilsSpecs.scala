package com.github.mocyuto

import org.scalatest.{ FlatSpec, Matchers }
import com.github.mocyuto.MapUtils._

class MapUtilsSpecs extends FlatSpec with Matchers {

  "Map" should "grouping" in {
    Seq((1, 2), (2, 3), (1, 3)).grouping() shouldBe Map(2 -> Seq(3), 1 -> Seq(2, 3))
  }
}
