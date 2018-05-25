
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

object modifClasse extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.tables.pojos.Classe,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(classe : models.tables.pojos.Classe):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Welcome to Play")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""
  """),format.raw/*5.3*/("""<h1>Modifier une classe!</h1>
  
  <form action=""""),_display_(/*7.18*/routes/*7.24*/.ClasseController.updateClasse()),format.raw/*7.56*/("""" method="POST">
  """),_display_(/*8.4*/CSRF/*8.8*/.formField),format.raw/*8.18*/("""
  """),format.raw/*9.3*/("""<fieldset>
  <legend>Modification de la classe</legend>	
  		<input name="id" value=""""),_display_(/*11.30*/classe/*11.36*/.getId),format.raw/*11.42*/("""" type="hidden">
	    <label for="libelle">Libelle classe :</label>
	    <input type="text" id="libelle" name="libelle" value=""""),_display_(/*13.61*/classe/*13.67*/.getLibelle),format.raw/*13.78*/("""">
	    
        	<input type="submit" value="Enregistrer">
        	
    </fieldset>
 </form>
 
""")))}))
      }
    }
  }

  def render(classe:models.tables.pojos.Classe): play.twirl.api.HtmlFormat.Appendable = apply(classe)

  def f:((models.tables.pojos.Classe) => play.twirl.api.HtmlFormat.Appendable) = (classe) => apply(classe)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 09 17:50:49 WAT 2018
                  SOURCE: /home/advinteck/Bureau/Play/test/app/views/modifClasse.scala.html
                  HASH: 22e52366c95c743966a6672fcf19bc226c5b2ab1
                  MATRIX: 974->1|1084->40|1128->56|1155->58|1186->81|1225->83|1254->86|1330->136|1344->142|1396->174|1441->194|1452->198|1482->208|1511->211|1624->297|1639->303|1666->309|1821->437|1836->443|1868->454
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|39->8|39->8|40->9|42->11|42->11|42->11|44->13|44->13|44->13
                  -- GENERATED --
              */
          