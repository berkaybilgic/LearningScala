ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.11" % Test

lazy val root = (project in file("."))
  .settings(
    name := "untitled"
  )
