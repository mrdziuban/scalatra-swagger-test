package io.github.mrdziuban.controllers

import org.json4s.{DefaultFormats, Formats}
import org.scalatra._
import org.scalatra.json._
import org.scalatra.swagger.{Swagger, SwaggerSupport}

case class Test(
  required1: Int,
  option1: Option[Int],
  required2: Int,
  option2: Option[Int],
  required3: Int,
  required4: Int,
  option3: Option[Int],
  option4: Option[Int])

class TestController(implicit override val swagger: Swagger) extends ScalatraServlet with NativeJsonSupport with SwaggerSupport {
  protected implicit lazy val jsonFormats: Formats = DefaultFormats
  protected val applicationDescription = "Test API"

  val test = apiOperation[Test]("get")

  get("/", operation(test)) { Test(1, Some(1), 1, Some(1), 1, 1, Some(1), Some(1)) }
}
