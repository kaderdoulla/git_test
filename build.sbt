name := """test"""
organization := "advinteck.sarl"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.4"

libraryDependencies += guice

libraryDependencies ++= Seq(
	javaJdbc,
	javaWs,
	"net.sf.jasperreports" % "jasperreports" % "6.5.1"  withSources()
)

// https://mvnrepository.com/artifact/org.jooq/jooq 
libraryDependencies += "org.jooq" % "jooq" % "3.10.1"

import com.typesafe.sbteclipse.core.EclipsePlugin.EclipseKeys
EclipseKeys.skipParents in ThisBuild := false


