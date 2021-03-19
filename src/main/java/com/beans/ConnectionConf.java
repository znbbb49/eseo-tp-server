package com.beans;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.config.JDBCConfiguration;
import com.mysql.jdbc.ResultSetMetaData;


public class ConnectionConf {


	/**
	 * Hello world!
	 *
	 */
/*
	    public String getVille()
	    {
	    	Ville ville ;
	    	List <Ville> listeVilles ;
	    	JDBCConfiguration jdbcConf  = new JDBCConfiguration();
	    	
	    	Connection con;
			try {
				con = jdbcConf.loadConnection();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	       
	        String insert = "select * from ville_france" ;
	            //String insertionPlayer = "INSERT INTO TABLE PLAYER VALUES 1,"
	            try {
	               

	                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetmaven", "root", "");
	                java.sql.Statement stmt = con.createStatement();
	                //stmt.executeQuery(CREATE_TABLE_SQL);
	                ResultSet result = stmt.executeQuery(insert);
	                java.sql.ResultSetMetaData rsmd = result.getMetaData();
	                int columnsNumber = rsmd.getColumnCount();
	                while (result.next()) {
	                   ville 
	                        return villes ;
	                    }
	                    
	                    System.out.println("");
	                }
	        

	                con.close();

	            } catch (Exception e) {
	                e.printStackTrace();
	            }  return "" ;
	        } */
	    
	    }



