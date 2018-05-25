package services;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.jooq.Configuration;
import org.jooq.DSLContext;

import com.google.inject.Inject;

import models.tables.daos.ClasseDao;
import models.tables.pojos.Classe;
import modules.Connexion;

public class ClasseService {
	private final DSLContext connect;
	private final Configuration conf;
	
	public ClasseDao classeDao;
	
	@Inject
	public ClasseService(Connexion con) {
		this.conf = con.connection(con.getCnx()).configuration();
		this.connect = con.connection(con.getCnx());
		this.classeDao = new ClasseDao(conf);
	}
	
	/*public List<Classe> list(){
		List<Classe> clsList;
		clsList = connect.selectFrom(CLASSE).fetchInto(Classe.class);
		return clsList;
	}*/
	
	
	public Map<Integer, String> option(){
		Map<Integer, String> options = new LinkedHashMap<Integer, String>();
		for(Classe classe: classeDao.findAll())
			options.put(classe.getId(), classe.getLibelle());
		return options;
	}
		
}
