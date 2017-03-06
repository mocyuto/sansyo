import sbt._
import Keys._

object build {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.1"

  private[this] val Scala211 = "2.11.8"

  lazy val commonSettings =
  Seq(
    organization := "com.github.mocyuto",
    version      := "0.1.0",
    crossScalaVersions := Scala211 :: "2.12.1" :: Nil,
    name := "sansyo",
    libraryDependencies ++= Seq(
      scalaTest
    )
  )

}
