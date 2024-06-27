ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.1.0"

lazy val root = (project in file("."))
  .settings(
    name := "agbdist.sphere.packing",
    libraryDependencies += "org.scala-lang" %% "scala3-library" % "3.1.2"
  )

enablePlugins(SbtOsgi)

OsgiKeys.exportPackage := Seq("ForestAGBSpherePacking.*")

OsgiKeys.importPackage := Seq("*;resolution:=optional")

OsgiKeys.privatePackage := Seq("!scala.*","*")

OsgiKeys.requireCapability := """osgi.ee;filter:="(&(osgi.ee=JavaSE)(version=1.8))""""