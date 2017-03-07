import build._
lazy val root = (project in file("."))
  .settings(commonSettings)
publishTo := Some(Resolver.file("file", new File("docs"))(Patterns(true, Resolver.mavenStyleBasePattern)))
