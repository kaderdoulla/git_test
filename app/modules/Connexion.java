package modules;

import java.sql.*;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class Connexion {
	private Connection cnx;
	private String url = "jdbc:postgresql://localhost/dbTest";
	private String user = "postgres";
	private String passwd = "postgres";
	private String driver = "org.postgresql.Driver";
	
	public  DSLContext connection(Connection connex){
		try {
			Class.forName(driver);
			//this.cnx = DriverManager.getConnection(this.getUrl(), this.getUser(),this.getPasswd());
			return DSL.using(connex, SQLDialect.POSTGRES_9_5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public Connection getCnx() {
		try {
			Class.forName(driver);
			this.cnx = DriverManager.getConnection(this.url, this.user,this.passwd);
			return this.cnx;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}
