import io.github.mrdziuban._
import io.github.mrdziuban.controllers._
import javax.servlet.ServletContext
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {
  implicit val swagger = new TestSwagger

  override def init(context: ServletContext) {
    context.mount(new TestController, "/test", "test")
    context.mount(new ResourcesApp, "/api-docs")
  }
}
