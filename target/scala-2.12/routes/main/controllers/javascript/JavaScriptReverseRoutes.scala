// @GENERATOR:play-routes-compiler
// @SOURCE:/home/advinteck/Bureau/Play/test/conf/routes
// @DATE:Thu May 17 14:31:44 WAT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:7
  class ReverseClasseController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def ajoutClasse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClasseController.ajoutClasse",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ajoutClasse"})
        }
      """
    )
  
    // @LINE:7
    def listeClasse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClasseController.listeClasse",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listeClasse"})
        }
      """
    )
  
    // @LINE:8
    def saveClasse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClasseController.saveClasse",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveClasse"})
        }
      """
    )
  
    // @LINE:11
    def updateClasse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClasseController.updateClasse",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "modifClasse"})
        }
      """
    )
  
    // @LINE:12
    def modifClasse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClasseController.modifClasse",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "modifClasse" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:10
    def deleteClasse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClasseController.deleteClasse",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteClasse" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseEtudiantController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def generationPdf: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EtudiantController.generationPdf",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "impression"})
        }
      """
    )
  
    // @LINE:15
    def listeEtudiant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EtudiantController.listeEtudiant",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listeEtudiant"})
        }
      """
    )
  
    // @LINE:18
    def saveEtudiant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EtudiantController.saveEtudiant",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveEtudiant"})
        }
      """
    )
  
    // @LINE:16
    def deleteEtudiant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EtudiantController.deleteEtudiant",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteEtudiant" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:17
    def ajoutEtudiant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EtudiantController.ajoutEtudiant",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ajoutEtudiant"})
        }
      """
    )
  
    // @LINE:20
    def modifEtudiant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EtudiantController.modifEtudiant",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "modifEtudiant" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:19
    def updateEtudiant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EtudiantController.updateEtudiant",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "modifEtudiant"})
        }
      """
    )
  
  }


}
