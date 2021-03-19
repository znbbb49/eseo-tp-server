package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.beans.Ville;
import com.config.JDBCConfiguration;

public class VilleDAOImpl implements VilleDAO{

	@Override
	public List <Ville> listeVilles() {
		Ville ville ;
    	List <Ville> listeVilles = new ArrayList <Ville>() ;
    	JDBCConfiguration jdbcConf  = new JDBCConfiguration();
    	String afficheVille = null ;
    	
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
                   ville= new Ville(result.getString(1),result.getString(2),result.getString(3),result.getString(5),result.getString(6));
                       listeVilles.add(ville);
                        System.out.print(ville.toString());
                    } 
               
                
                return listeVilles ;
                    
        
            } 
            
	catch (Exception e) {
                e.printStackTrace();
            }
            return null ;
	}

	

	@Override
	public Ville getVilleByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<String> valueVille() {
		List<String> affiche = new ArrayList <String>() ;
		// TODO Auto-generated method stub
		List<Ville> villes = this.listeVilles() ;
		for(int i=0;i<villes.size();i++) {
			affiche.add(villes.get(i).toString());
			
			return affiche ;
			
		}
		return null;
	}

}
