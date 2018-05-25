// @GENERATOR:play-routes-compiler
// @SOURCE:/home/advinteck/Bureau/Play/test/conf/routes
// @DATE:Thu May 17 14:31:44 WAT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:7
  ClasseController_0: controllers.ClasseController,
  // @LINE:15
  EtudiantController_1: controllers.EtudiantController,
  // @LINE:25
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:7
    ClasseController_0: controllers.ClasseController,
    // @LINE:15
    EtudiantController_1: controllers.EtudiantController,
    // @LINE:25
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_2, ClasseController_0, EtudiantController_1, Assets_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, ClasseController_0, EtudiantController_1, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listeClasse""", """controllers.ClasseController.listeClasse"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """saveClasse""", """controllers.ClasseController.saveClasse"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ajoutClasse""", """controllers.ClasseController.ajoutClasse"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteClasse""", """controllers.ClasseController.deleteClasse(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modifClasse""", """controllers.ClasseController.updateClasse"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modifClasse""", """controllers.ClasseController.modifClasse(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listeEtudiant""", """controllers.EtudiantController.listeEtudiant"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteEtudiant""", """controllers.EtudiantController.deleteEtudiant(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ajoutEtudiant""", """controllers.EtudiantController.ajoutEtudiant"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """saveEtudiant""", """controllers.EtudiantController.saveEtudiant"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modifEtudiant""", """controllers.EtudiantController.updateEtudiant"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modifEtudiant""", """controllers.EtudiantController.modifEtudiant(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """impression""", """controllers.EtudiantController.generationPdf"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ClasseController_listeClasse1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listeClasse")))
  )
  private[this] lazy val controllers_ClasseController_listeClasse1_invoker = createInvoker(
    ClasseController_0.listeClasse,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClasseController",
      "listeClasse",
      Nil,
      "GET",
      this.prefix + """listeClasse""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ClasseController_saveClasse2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("saveClasse")))
  )
  private[this] lazy val controllers_ClasseController_saveClasse2_invoker = createInvoker(
    ClasseController_0.saveClasse,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClasseController",
      "saveClasse",
      Nil,
      "POST",
      this.prefix + """saveClasse""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ClasseController_ajoutClasse3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ajoutClasse")))
  )
  private[this] lazy val controllers_ClasseController_ajoutClasse3_invoker = createInvoker(
    ClasseController_0.ajoutClasse,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClasseController",
      "ajoutClasse",
      Nil,
      "GET",
      this.prefix + """ajoutClasse""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ClasseController_deleteClasse4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteClasse")))
  )
  private[this] lazy val controllers_ClasseController_deleteClasse4_invoker = createInvoker(
    ClasseController_0.deleteClasse(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClasseController",
      "deleteClasse",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deleteClasse""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ClasseController_updateClasse5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modifClasse")))
  )
  private[this] lazy val controllers_ClasseController_updateClasse5_invoker = createInvoker(
    ClasseController_0.updateClasse,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClasseController",
      "updateClasse",
      Nil,
      "POST",
      this.prefix + """modifClasse""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ClasseController_modifClasse6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modifClasse")))
  )
  private[this] lazy val controllers_ClasseController_modifClasse6_invoker = createInvoker(
    ClasseController_0.modifClasse(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClasseController",
      "modifClasse",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """modifClasse""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_EtudiantController_listeEtudiant7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listeEtudiant")))
  )
  private[this] lazy val controllers_EtudiantController_listeEtudiant7_invoker = createInvoker(
    EtudiantController_1.listeEtudiant,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EtudiantController",
      "listeEtudiant",
      Nil,
      "GET",
      this.prefix + """listeEtudiant""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_EtudiantController_deleteEtudiant8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteEtudiant")))
  )
  private[this] lazy val controllers_EtudiantController_deleteEtudiant8_invoker = createInvoker(
    EtudiantController_1.deleteEtudiant(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EtudiantController",
      "deleteEtudiant",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deleteEtudiant""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_EtudiantController_ajoutEtudiant9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ajoutEtudiant")))
  )
  private[this] lazy val controllers_EtudiantController_ajoutEtudiant9_invoker = createInvoker(
    EtudiantController_1.ajoutEtudiant,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EtudiantController",
      "ajoutEtudiant",
      Nil,
      "GET",
      this.prefix + """ajoutEtudiant""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_EtudiantController_saveEtudiant10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("saveEtudiant")))
  )
  private[this] lazy val controllers_EtudiantController_saveEtudiant10_invoker = createInvoker(
    EtudiantController_1.saveEtudiant,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EtudiantController",
      "saveEtudiant",
      Nil,
      "POST",
      this.prefix + """saveEtudiant""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_EtudiantController_updateEtudiant11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modifEtudiant")))
  )
  private[this] lazy val controllers_EtudiantController_updateEtudiant11_invoker = createInvoker(
    EtudiantController_1.updateEtudiant,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EtudiantController",
      "updateEtudiant",
      Nil,
      "POST",
      this.prefix + """modifEtudiant""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_EtudiantController_modifEtudiant12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modifEtudiant")))
  )
  private[this] lazy val controllers_EtudiantController_modifEtudiant12_invoker = createInvoker(
    EtudiantController_1.modifEtudiant(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EtudiantController",
      "modifEtudiant",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """modifEtudiant""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_EtudiantController_generationPdf13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("impression")))
  )
  private[this] lazy val controllers_EtudiantController_generationPdf13_invoker = createInvoker(
    EtudiantController_1.generationPdf,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EtudiantController",
      "generationPdf",
      Nil,
      "GET",
      this.prefix + """impression""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Assets_versioned14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned14_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:7
    case controllers_ClasseController_listeClasse1_route(params@_) =>
      call { 
        controllers_ClasseController_listeClasse1_invoker.call(ClasseController_0.listeClasse)
      }
  
    // @LINE:8
    case controllers_ClasseController_saveClasse2_route(params@_) =>
      call { 
        controllers_ClasseController_saveClasse2_invoker.call(ClasseController_0.saveClasse)
      }
  
    // @LINE:9
    case controllers_ClasseController_ajoutClasse3_route(params@_) =>
      call { 
        controllers_ClasseController_ajoutClasse3_invoker.call(ClasseController_0.ajoutClasse)
      }
  
    // @LINE:10
    case controllers_ClasseController_deleteClasse4_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ClasseController_deleteClasse4_invoker.call(ClasseController_0.deleteClasse(id))
      }
  
    // @LINE:11
    case controllers_ClasseController_updateClasse5_route(params@_) =>
      call { 
        controllers_ClasseController_updateClasse5_invoker.call(ClasseController_0.updateClasse)
      }
  
    // @LINE:12
    case controllers_ClasseController_modifClasse6_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ClasseController_modifClasse6_invoker.call(ClasseController_0.modifClasse(id))
      }
  
    // @LINE:15
    case controllers_EtudiantController_listeEtudiant7_route(params@_) =>
      call { 
        controllers_EtudiantController_listeEtudiant7_invoker.call(EtudiantController_1.listeEtudiant)
      }
  
    // @LINE:16
    case controllers_EtudiantController_deleteEtudiant8_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_EtudiantController_deleteEtudiant8_invoker.call(EtudiantController_1.deleteEtudiant(id))
      }
  
    // @LINE:17
    case controllers_EtudiantController_ajoutEtudiant9_route(params@_) =>
      call { 
        controllers_EtudiantController_ajoutEtudiant9_invoker.call(EtudiantController_1.ajoutEtudiant)
      }
  
    // @LINE:18
    case controllers_EtudiantController_saveEtudiant10_route(params@_) =>
      call { 
        controllers_EtudiantController_saveEtudiant10_invoker.call(EtudiantController_1.saveEtudiant)
      }
  
    // @LINE:19
    case controllers_EtudiantController_updateEtudiant11_route(params@_) =>
      call { 
        controllers_EtudiantController_updateEtudiant11_invoker.call(EtudiantController_1.updateEtudiant)
      }
  
    // @LINE:20
    case controllers_EtudiantController_modifEtudiant12_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_EtudiantController_modifEtudiant12_invoker.call(EtudiantController_1.modifEtudiant(id))
      }
  
    // @LINE:22
    case controllers_EtudiantController_generationPdf13_route(params@_) =>
      call { 
        controllers_EtudiantController_generationPdf13_invoker.call(EtudiantController_1.generationPdf)
      }
  
    // @LINE:25
    case controllers_Assets_versioned14_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned14_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
