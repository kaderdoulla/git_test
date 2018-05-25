package controllers;

import java.io.File;
import java.sql.Date;
import java.util.List;

import javax.inject.Inject;
import models.tables.pojos.Etudiants;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import services.ClasseService;
import services.EtudiantService;
import services.Service;
import utils.JasperPrinter;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */

public class EtudiantController extends Controller{
	
	
	public final EtudiantService etudiantService;
	public final ClasseService classeService;
	public final Service serv;
	public final JasperPrinter jasperPrinter;
	
	@Inject
	FormFactory formFacto;
		
	@Inject
	public EtudiantController(EtudiantService etudiantService, Service serv,ClasseService classeService, JasperPrinter jasperPrinter) {
		this.etudiantService = etudiantService;
		this.classeService = classeService;
		this.serv = serv;
		this.jasperPrinter = jasperPrinter;
	}
	
	public Result generationPdf(){
		jasperPrinter.print();
		File f = new File(new File("").getAbsolutePath()+"/public/etat/exemple.pdf");
		if (f.exists()){
			return ok().sendFile(f, true);
		}else{
		return redirect(routes.EtudiantController.listeEtudiant());
		}
		
	}
	
    public Result listeEtudiant() {
    	List<Etudiants> listEtudiant;
    	listEtudiant = etudiantService.etudiantsDao.findAll();
        return ok(views.html.listeEtudiant.render(listEtudiant));
    }
    
    public Result deleteEtudiant(int id){
    	etudiantService.etudiantsDao.deleteById(id);
    	return redirect(routes.EtudiantController.listeEtudiant());
    }
    
    public Result ajoutEtudiant(){
    	return ok(views.html.ajoutEtudiant.render(classeService.option()));
    }
    
    public Result saveEtudiant() {
    	Form<Etudiants> etudiantForm = formFacto.form(Etudiants.class).bindFromRequest();
    	Etudiants e = etudiantForm.get();
    	String dteNais = formFacto.form().bindFromRequest().get("dnaissance");
    	try {
    		e.setDateNaissance(serv.getSqlDate(dteNais, "dd/MM/yyyy"));
		} catch (Exception e2) {
			e2.printStackTrace();
		}
    	etudiantService.etudiantsDao.insert(e);
        return redirect(routes.EtudiantController.listeEtudiant());
    }
    
    public Result modifEtudiant(int id){
    	Etudiants e = etudiantService.etudiantsDao.findById(id);
    	return ok(views.html.modifEtudiant.render(e,classeService.classeDao.findAll()));
		}
	
	public Result updateEtudiant(){
		Form<Etudiants> etuForm = formFacto.form(Etudiants.class).bindFromRequest();
		Etudiants e = etuForm.get();		
		String dteNais = formFacto.form().bindFromRequest().get("dnaissance");
		try {
    		e.setDateNaissance(serv.getSqlDate(dteNais,"dd/MM/yyyy"));
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		etudiantService.etudiantsDao.update(e);
		 return redirect(routes.EtudiantController.listeEtudiant());
		}
    
}
