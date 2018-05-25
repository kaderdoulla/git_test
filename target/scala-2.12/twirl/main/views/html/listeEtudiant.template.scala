
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

object listeEtudiant extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.tables.pojos.Etudiants],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(etudiants: List[models.tables.pojos.Etudiants] ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/(""" 
"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to Play!</h1>
  
        <div class="button">
        	<a href="/ajoutEtudiant">Ajout Etudiant</a>
    	</div><br/><div>
        	<a href=""""),_display_(/*9.20*/routes/*9.26*/.EtudiantController.generationPdf()),format.raw/*9.61*/("""">Impression</a>
    	</div><br/>
 		<table border="">
                <tr>
                    <td>Nom</td>
                    <td>Prénom</td>
                    <td>Téléphone</td>
                    <td>Date de Naissance</td>
                    <td>Libelle classe</td>
                    <td colspan="2">Action</td>
                </tr>
                 """),_display_(/*20.19*/for(etu <- etudiants) yield /*20.40*/ {_display_(Seq[Any](format.raw/*20.42*/("""
                """),format.raw/*21.17*/("""<tr>
                    <td>"""),_display_(/*22.26*/etu/*22.29*/.getNom),format.raw/*22.36*/("""</td>
                    <td>"""),_display_(/*23.26*/etu/*23.29*/.getPromon),format.raw/*23.39*/("""</td>
                    <td>"""),_display_(/*24.26*/etu/*24.29*/.getTelephone),format.raw/*24.42*/("""</td>
                    <td>"""),_display_(/*25.26*/etu/*25.29*/.getDateNaissance),format.raw/*25.46*/("""</td>
                    <td>"""),_display_(/*26.26*/etu/*26.29*/.getIdClasse),format.raw/*26.41*/("""</td>
                    <td>
					<a href=""""),_display_(/*28.16*/routes/*28.22*/.EtudiantController.modifEtudiant(etu.getId)),format.raw/*28.66*/("""">Modifier</a>
					</td>
					  <td>
       				 <a href=""""),_display_(/*31.23*/routes/*31.29*/.EtudiantController.deleteEtudiant(etu.getId)),format.raw/*31.74*/("""">Supprimer</a>
					</td>
                </tr>
                """)))}),format.raw/*34.18*/("""
 		"""),format.raw/*35.4*/("""</table>

""")))}))
      }
    }
  }

  def render(etudiants:List[models.tables.pojos.Etudiants]): play.twirl.api.HtmlFormat.Appendable = apply(etudiants)

  def f:((List[models.tables.pojos.Etudiants]) => play.twirl.api.HtmlFormat.Appendable) = (etudiants) => apply(etudiants)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 14:20:33 WAT 2018
                  SOURCE: /home/advinteck/Bureau/Play/test/app/views/listeEtudiant.scala.html
                  HASH: f8f8174905280877fe49578d78140129471bf2dd
                  MATRIX: 985->1|1128->51|1156->54|1187->77|1226->79|1255->82|1433->234|1447->240|1502->275|1892->638|1929->659|1969->661|2014->678|2071->708|2083->711|2111->718|2169->749|2181->752|2212->762|2270->793|2282->796|2316->809|2374->840|2386->843|2424->860|2482->891|2494->894|2527->906|2600->952|2615->958|2680->1002|2767->1062|2782->1068|2848->1113|2945->1179|2976->1183
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|40->9|40->9|40->9|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|59->28|59->28|59->28|62->31|62->31|62->31|65->34|66->35
                  -- GENERATED --
              */
          