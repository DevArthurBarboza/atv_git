package br.com.unifil.mvc.controller.crud;

import java.sql.*;
import br.com.unifil.mvc.model.User.java;

public class CrudUser {

	private final String DATABASE_URL = "jdbc:mysql://localhost:3306/JAVA_CRUD";
	private final String DATABASE_USERNAME = "root";
	private final String DATABASE_PASSWORD = "";
	
	private Connection con; 
	
	public boolean open() throws SQLException {
		this.con = DriverManager.getConnection(
				this.DATABASE_URL,
				this.DATABASE_USERNAME,
				this.DATABASE_PASSWORD
				);
		
		return this.con != null;
		
	}
	
	public void close() throws SQLException {
		this.con.close();
	}
	
	public boolean create(User user) {
		return false;
	}
}
