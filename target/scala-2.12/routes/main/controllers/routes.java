// @GENERATOR:play-routes-compiler
// @SOURCE:/home/advinteck/Bureau/Play/test/conf/routes
// @DATE:Thu May 17 14:31:44 WAT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseClasseController ClasseController = new controllers.ReverseClasseController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseEtudiantController EtudiantController = new controllers.ReverseEtudiantController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseClasseController ClasseController = new controllers.javascript.ReverseClasseController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseEtudiantController EtudiantController = new controllers.javascript.ReverseEtudiantController(RoutesPrefix.byNamePrefix());
  }

}
