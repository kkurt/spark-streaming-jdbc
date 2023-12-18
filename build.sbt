import scala.collection.Seq

ThisBuild / organization := "com.xworks"
ThisBuild / scalaVersion := "2.13.8"
ThisBuild / version := "latest"

lazy val root = (project in file("."))
  .settings(
    name := "spark-streaming",
    maintainer := "kursat@affix.zone"
  )
val sparkVersion="3.5.0"
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % sparkVersion,
      "org.apache.spark" %% "spark-sql" % sparkVersion,
    )
Compile / scalacOptions ++= Seq(
  "-target:17",
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Xlog-reflective-calls",
  "-Xlint")