package io.github.mrdziuban

import org.scalatra.ScalatraServlet
import org.scalatra.swagger.{ApiInfo, NativeSwaggerBase, Swagger}

class ResourcesApp(implicit val swagger: Swagger) extends ScalatraServlet with NativeSwaggerBase

object TestApiInfo extends ApiInfo(
  "Test API",
  "Docs for the test API",
  "http://test.com",
  "test@test.com",
  "MIT",
  "http://opensource.org/licenses/MIT")

class TestSwagger extends Swagger(Swagger.SpecVersion, "1.0.0", TestApiInfo)
