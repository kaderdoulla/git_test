package controllers;

import java.util.List;

import javax.inject.Inject;

import models.tables.pojos.Classe;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import services.ClasseService;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */

public class ClasseController extends Controller{
	
	private final ClasseService classeService;
	
	@Inject
	FormFactory formFacto;
	
	@Inject
	public ClasseController(ClasseService classeService) {
		this.classeService = classeService;
	}

    public Result listeClasse() {
    	List<Classe> listClasse;
    	listClasse = classeService.classeDao.findAll();
        return ok(views.html.listeClasse.render(listClasse));
    }
    
	public Result ajoutClasse() {
	    	
	        return ok(views.html.ajoutClasse.render());
	    }
	    
	public Result saveClasse() {
	    	Form<Classe> classForm = formFacto.form(Classe.class).bindFromRequest();
	    	Classe c = classForm.get();
	    	classeService.classeDao.insert(c);
	        return ok(views.html.listeClasse.render(classeService.classeDao.findAll()));
	    }
	    
	public Result deleteClasse(int id){
	    	classeService.classeDao.deleteById(id);
	    	return redirect(routes.ClasseController.listeClasse());
	    }
		
	public Result modifClasse(int id){
    	Classe c = classeService.classeDao.findById(id);
    	return ok(views.html.modifClasse.render(c));
		}
	
	public Result updateClasse(){
		Form<Classe> classForm = formFacto.form(Classe.class).bindFromRequest();
    	Classe c = classForm.get();
		 classeService.classeDao.update(c);
		 return redirect(routes.ClasseController.listeClasse());
		}
	
}
