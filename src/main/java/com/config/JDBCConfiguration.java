package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JDBCConfiguration {
	@Bean
	public static Connection getConnexion() {
		String url = "jdbc:mysql://localhost:3306/projetmaven?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";
		String user = "root";
		String passwd = "";
		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("Connecter");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur");
			System.exit(0);
		}
		return conn;
	}
}
