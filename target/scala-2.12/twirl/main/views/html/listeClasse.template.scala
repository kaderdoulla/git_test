
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

object listeClasse extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.tables.pojos.Classe],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(classes: List[models.tables.pojos.Classe] ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/(""" 
"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to Play!</h1>
  
        <div class="button">
        	<a href="/ajoutClasse">Ajout classe</a>
    	</div></br>
 		<table border="">
                <tr>
                    <td>Id</td>
                    <td>Libelle de la classe</td>
                    <td colspan="2">Action</td>
                </tr>
                 """),_display_(/*15.19*/for(cls <- classes) yield /*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/("""
                """),format.raw/*16.17*/("""<tr>
                    <td>"""),_display_(/*17.26*/cls/*17.29*/.getId),format.raw/*17.35*/("""</td>
                    <td>"""),_display_(/*18.26*/cls/*18.29*/.getLibelle),format.raw/*18.40*/("""</td>
                    <td>
					<a href=""""),_display_(/*20.16*/routes/*20.22*/.ClasseController.modifClasse(cls.getId)),format.raw/*20.62*/("""">Modifier</a>
					</td>
					  <td>
       				 <a href=""""),_display_(/*23.23*/routes/*23.29*/.ClasseController.deleteClasse(cls.getId)),format.raw/*23.70*/("""">Supprimer</a>
					</td>
                </tr>
                """)))}),format.raw/*26.18*/("""
 		"""),format.raw/*27.4*/("""</table>

""")))}))
      }
    }
  }

  def render(classes:List[models.tables.pojos.Classe]): play.twirl.api.HtmlFormat.Appendable = apply(classes)

  def f:((List[models.tables.pojos.Classe]) => play.twirl.api.HtmlFormat.Appendable) = (classes) => apply(classes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 09 17:27:07 WAT 2018
                  SOURCE: /home/advinteck/Bureau/Play/test/app/views/listeClasse.scala.html
                  HASH: 7df18c84268247b4185ddc5acba18ef758c2bd26
                  MATRIX: 980->1|1118->46|1146->49|1177->72|1216->74|1245->77|1608->413|1643->432|1683->434|1728->451|1785->481|1797->484|1824->490|1882->521|1894->524|1926->535|1999->581|2014->587|2075->627|2162->687|2177->693|2239->734|2336->800|2367->804
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|49->18|49->18|51->20|51->20|51->20|54->23|54->23|54->23|57->26|58->27
                  -- GENERATED --
              */
          