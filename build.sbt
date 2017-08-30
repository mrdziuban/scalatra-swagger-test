import org.scalatra.sbt._
import org.scalatra.sbt.PluginKeys._

val ScalatraVersion = "2.5.1"

ScalatraPlugin.scalatraSettings

organization := "io.github.mrdziuban"

name := "Scalatra Swagger Test"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.3"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-json" % ScalatraVersion,
  "org.scalatra" %% "scalatra-swagger" % ScalatraVersion,
  "org.json4s" %% "json4s-native" % "3.5.0",
  "ch.qos.logback" % "logback-classic" % "1.1.5" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.15.v20160210" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
)

enablePlugins(JettyPlugin)
