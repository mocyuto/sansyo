# sansyo

[![Build Status](https://travis-ci.org/moc-yuto/sansyo.svg?branch=master)](https://travis-ci.org/moc-yuto/sansyo)


This library is for Scala collections utility.  
"sansyo(山椒)" means Japanese pepper.


## How to Use

add Resolver and Dependency in build.sbt

```scala
resolvers += "sonatype releases" at "https://oss.sonatype.org/content/repositories/releases/"
libraryDependency += "com.github.moc-yuto"  %% "sansyo"               % "0.1.1"
```


## Quick Start

emptyOrElse
```scala
import com.github.mocyuto.SeqUtils._

val seq = Seq(1,2,3)
val emptySeq = Seq()

seq.emptyOrElse(Seq(0)) // Seq(1,2,3)
emptySeq.emptyOrElse(Seq(0)) // Seq(0)

```

partitionMap
```scala
import com.github.mocyuto.SeqUtils._

val seq = Seq(1,2,3)

seq.partitionMap(_ > 1)(a => a + 1) // (Seq(3, 4), Seq(2))


```

grouping
```scala
import com.github.mocyuto.MapUtils._

val seq = Seq((1,2),(2, 3),(1,3))

seq.grouping() // Map(2 -> Seq(3), 1 -> Seq(2, 3))

```
