
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

object modifEtudiant extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.tables.pojos.Etudiants,List[models.tables.pojos.Classe],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(etudiant: models.tables.pojos.Etudiants, classes: List[models.tables.pojos.Classe]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Welcome to Play")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
  """),format.raw/*6.3*/("""<h1>Modifier un etudiant!</h1>
  
  <form action=""""),_display_(/*8.18*/routes/*8.24*/.EtudiantController.updateEtudiant()),format.raw/*8.60*/("""" method="POST">
  """),_display_(/*9.4*/CSRF/*9.8*/.formField),format.raw/*9.18*/("""
  """),format.raw/*10.3*/("""<fieldset>
  <legend>Modification d'un etudiant</legend>	
  		<input name="id" value=""""),_display_(/*12.30*/etudiant/*12.38*/.getId),format.raw/*12.44*/("""" type="hidden">
	    <label for="nom">Nom etudiant :</label>
	    <input type="text" id="nom" name="nom" value=""""),_display_(/*14.53*/etudiant/*14.61*/.getNom),format.raw/*14.68*/(""""><br/><br/>
	    
	    <label for="promon">Prenom etudiant :</label>
	    <input type="text" id="promon" name="promon" value=""""),_display_(/*17.59*/etudiant/*17.67*/.getPromon),format.raw/*17.77*/(""""><br/><br/>
	    
	    <label for="telephone">Téléphone etudiant :</label>
	    <input type="text" id="telephone" name="telephone" value=""""),_display_(/*20.65*/etudiant/*20.73*/.getTelephone),format.raw/*20.86*/(""""><br/><br/>
	    
	    <label for="dateNaissance">Date naissance :</label>
	    <input type="text" id="dateNaissance" name="dnaissance" value=""""),_display_(/*23.70*/etudiant/*23.78*/.getDateNaissance),format.raw/*23.95*/(""""><br/><br/>
	    
	    <label for="idClasse">Libelle clase :</label>
	    <select name="idClasse" id="idclasse">
	   		 <option value="">--- Choisir classe ---</option>
	   		 """),_display_(/*28.9*/for(cls <- classes) yield /*28.28*/{_display_(Seq[Any](format.raw/*28.29*/("""
	   		 	"""),format.raw/*29.9*/("""<option """),_display_(/*29.18*/if(etudiant.getIdClasse == cls.getId)/*29.55*/{_display_(Seq[Any](format.raw/*29.56*/("""selected""")))}),format.raw/*29.65*/(""" """),format.raw/*29.66*/("""value=""""),_display_(/*29.74*/cls/*29.77*/.getId),format.raw/*29.83*/("""">"""),_display_(/*29.86*/cls/*29.89*/.getLibelle),format.raw/*29.100*/("""</option>
	   		 """)))}),format.raw/*30.9*/("""
	    """),format.raw/*31.6*/("""</select>
	    <br/><br/>
	    
        	<input type="submit" value="Enregistrer">
        	
    </fieldset>
 </form>
 
""")))}))
      }
    }
  }

  def render(etudiant:models.tables.pojos.Etudiants,classes:List[models.tables.pojos.Classe]): play.twirl.api.HtmlFormat.Appendable = apply(etudiant,classes)

  def f:((models.tables.pojos.Etudiants,List[models.tables.pojos.Classe]) => play.twirl.api.HtmlFormat.Appendable) = (etudiant,classes) => apply(etudiant,classes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri May 11 13:02:36 WAT 2018
                  SOURCE: /home/advinteck/Bureau/Play/test/app/views/modifEtudiant.scala.html
                  HASH: 82b92641f5525f0a0e61f196681e63d600a91e81
                  MATRIX: 1012->1|1169->88|1213->86|1240->104|1267->106|1298->129|1337->131|1366->134|1443->185|1457->191|1513->227|1558->247|1569->251|1599->261|1629->264|1743->351|1760->359|1787->365|1928->479|1945->487|1973->494|2128->622|2145->630|2176->640|2343->780|2360->788|2394->801|2566->946|2583->954|2621->971|2825->1149|2860->1168|2899->1169|2935->1178|2971->1187|3017->1224|3056->1225|3096->1234|3125->1235|3160->1243|3172->1246|3199->1252|3229->1255|3241->1258|3274->1269|3322->1287|3355->1293
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|40->9|40->9|41->10|43->12|43->12|43->12|45->14|45->14|45->14|48->17|48->17|48->17|51->20|51->20|51->20|54->23|54->23|54->23|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|62->31
                  -- GENERATED --
              */
          