
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

object ajoutClasse extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Welcome to Play")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""
  """),format.raw/*5.3*/("""<h1>Ajouter une classe!</h1>
  
  <form action=""""),_display_(/*7.18*/routes/*7.24*/.ClasseController.saveClasse()),format.raw/*7.54*/("""" method="POST">
  """),_display_(/*8.4*/CSRF/*8.8*/.formField),format.raw/*8.18*/("""
  """),format.raw/*9.3*/("""<fieldset>
  <legend>Ajout classe</legend>	
  
	    <label for="libelle">Libelle classe :</label>
	    <input type="text" id="libelle" name="libelle">
	    
        	<input type="submit" value="Save">
        	
    </fieldset>
 </form>
 
""")))}),format.raw/*20.2*/("""
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
                  SOURCE: /home/advinteck/Bureau/Play/test/app/views/ajoutClasse.scala.html
                  HASH: cc400d104fc5fd382bc5a43f28c761cfe7fda8d6
                  MATRIX: 947->1|1022->5|1066->21|1093->23|1124->46|1163->48|1192->51|1267->100|1281->106|1331->136|1376->156|1387->160|1417->170|1446->173|1715->412
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|39->8|39->8|40->9|51->20
                  -- GENERATED --
              */
          