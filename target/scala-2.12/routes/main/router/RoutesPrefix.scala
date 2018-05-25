// @GENERATOR:play-routes-compiler
// @SOURCE:/home/advinteck/Bureau/Play/test/conf/routes
// @DATE:Thu May 17 14:31:44 WAT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
