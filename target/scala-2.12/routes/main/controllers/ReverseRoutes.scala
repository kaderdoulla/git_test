// @GENERATOR:play-routes-compiler
// @SOURCE:/home/advinteck/Bureau/Play/test/conf/routes
// @DATE:Thu May 17 14:31:44 WAT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:7
  class ReverseClasseController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def ajoutClasse(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ajoutClasse")
    }
  
    // @LINE:7
    def listeClasse(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "listeClasse")
    }
  
    // @LINE:8
    def saveClasse(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "saveClasse")
    }
  
    // @LINE:11
    def updateClasse(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "modifClasse")
    }
  
    // @LINE:12
    def modifClasse(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "modifClasse" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:10
    def deleteClasse(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteClasse" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:25
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:15
  class ReverseEtudiantController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def generationPdf(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "impression")
    }
  
    // @LINE:15
    def listeEtudiant(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "listeEtudiant")
    }
  
    // @LINE:18
    def saveEtudiant(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "saveEtudiant")
    }
  
    // @LINE:16
    def deleteEtudiant(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteEtudiant" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:17
    def ajoutEtudiant(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ajoutEtudiant")
    }
  
    // @LINE:20
    def modifEtudiant(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "modifEtudiant" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:19
    def updateEtudiant(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "modifEtudiant")
    }
  
  }


}
