package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCConfiguration {
	Connection connexion = null ;
	public JDBCConfiguration() {
		
	}
	
	public java.sql.Connection loadConnection() throws SQLException {
		
		try {
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetmaven", "root", "");
			connexion.setAutoCommit(false);
		} catch (SQLException e1) {
			throw e1 ;
		}
		
		return connexion;
	}
	
	public void closeConnection() throws SQLException {
		connexion.close();
	}

}
