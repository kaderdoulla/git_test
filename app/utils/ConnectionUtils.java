package utils;

import java.sql.Connection;
import java.sql.SQLException;

import com.google.inject.Inject;

import modules.Connexion;

public class ConnectionUtils {
	
	@Inject
	private Connexion connexion;
	
	public  Connection getConnection() throws SQLException,
    ClassNotFoundException {

return connexion.getCnx();
}

}
