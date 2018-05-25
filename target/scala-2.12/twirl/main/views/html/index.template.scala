
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to Play!</h1>
  <nav>
	  <ul>
		  <li><a href=""""),_display_(/*7.19*/routes/*7.25*/.EtudiantController.listeEtudiant),format.raw/*7.58*/("""">Liste des Etudiants</a></li>
		  <li><a href=""""),_display_(/*8.19*/routes/*8.25*/.ClasseController.listeClasse),format.raw/*8.54*/("""">Liste des Classes</a></li>
	  </ul>
  </nav>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 09 17:27:07 WAT 2018
                  SOURCE: /home/advinteck/Bureau/Play/test/app/views/index.scala.html
                  HASH: 745ff3b613a8fb05092b937ec498147ac9ee523e
                  MATRIX: 941->1|1037->4|1064->6|1095->29|1134->31|1163->34|1249->94|1263->100|1316->133|1391->182|1405->188|1454->217|1532->265
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|39->8|39->8|42->11
                  -- GENERATED --
              */
          