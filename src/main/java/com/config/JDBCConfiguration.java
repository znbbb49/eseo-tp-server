package com.config;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JDBCConfiguration {
	
	private JDBCConfiguration() {
		
	}
	
	@Bean
	public static Connection getConnexion() {

		Connection conn = null;

		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetmaven", "root", "");
			

		} catch (Exception e) {
			
			System.out.println("Erreur");
			
		}
		return conn;
	}
}
