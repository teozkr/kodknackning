package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

	def about = Action {
		Ok(views.html.content.about())
	}

	def conventions = Action {
		Ok(views.html.content.conventions())
	}

  def repl = Action {
    Ok(views.html.content.repl())
  }

}