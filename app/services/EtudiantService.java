package services;

import org.jooq.Configuration;
import org.jooq.DSLContext;
import com.google.inject.Inject;
import models.tables.daos.EtudiantsDao;
import modules.Connexion;

public class EtudiantService {
	
	
	private final DSLContext connect;
	private final Configuration conf;
	
	public EtudiantsDao etudiantsDao;

	
	@Inject
	public EtudiantService(Connexion con) {
		this.conf = con.connection(con.getCnx()).configuration();
		this.connect = con.connection(con.getCnx());
		this.etudiantsDao = new EtudiantsDao(conf);
	}
	
}
