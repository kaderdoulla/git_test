
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

object ajoutEtudiant extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[Integer, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(option : Map[Integer,String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Welcome to Play")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""
  """),format.raw/*5.3*/("""<h1>Ajouter un etudiant!</h1>
  
  <form action=""""),_display_(/*7.18*/routes/*7.24*/.EtudiantController.saveEtudiant()),format.raw/*7.58*/("""" method="POST">
  """),_display_(/*8.4*/CSRF/*8.8*/.formField),format.raw/*8.18*/("""
  """),format.raw/*9.3*/("""<fieldset>
  <legend>Ajout etudiant</legend>	
  
	    <label for="nom">Nom :</label>
	    <input type="text" id="nom" name="nom"><br/><br/>
	    
	    <label for="promon">Prénom :</label>
	    <input type="text" id="promon" name="promon"><br/><br/>
	    
	    <label for="telephone">Téléphone :</label>
	    <input type="text" id="telephone" name="telephone"><br/><br/>
	    
	    <label for="dateNaissance">Date naissance :</label>
	    <input type="text" id="dateNaissance" name="dnaissance"><br/><br/>
	    
	    
	    <label for="idclasse">Libelle classe :</label>
	    <select name="idClasse" id="idclasse">
	   		 <option value="">--- Choisir classe ---</option>
	   		 """),_display_(/*28.9*/for((k,v) <- option) yield /*28.29*/{_display_(Seq[Any](format.raw/*28.30*/("""
	   			 """),format.raw/*29.9*/("""<option value=""""),_display_(/*29.25*/k),format.raw/*29.26*/("""">"""),_display_(/*29.29*/v),format.raw/*29.30*/("""</option>
	   		 """)))}),format.raw/*30.9*/("""
	    """),format.raw/*31.6*/("""</select>
	    <br/><br/>
        <input type="submit" value="Save">
        	
    </fieldset>
 </form>
 
""")))}),format.raw/*38.2*/("""
"""))
      }
    }
  }

  def render(option:Map[Integer, String]): play.twirl.api.HtmlFormat.Appendable = apply(option)

  def f:((Map[Integer, String]) => play.twirl.api.HtmlFormat.Appendable) = (option) => apply(option)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri May 11 10:17:21 WAT 2018
                  SOURCE: /home/advinteck/Bureau/Play/test/app/views/ajoutEtudiant.scala.html
                  HASH: da51b81baf82a25f94946cf0396bca08fd4bdd06
                  MATRIX: 970->1|1073->33|1117->49|1144->51|1175->74|1214->76|1243->79|1319->129|1333->135|1387->169|1432->189|1443->193|1473->203|1502->206|2205->883|2241->903|2280->904|2316->913|2359->929|2381->930|2411->933|2433->934|2481->952|2514->958|2651->1065
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|39->8|39->8|40->9|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|61->30|62->31|69->38
                  -- GENERATED --
              */
          