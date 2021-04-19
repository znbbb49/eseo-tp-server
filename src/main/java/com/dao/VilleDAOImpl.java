package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import org.springframework.stereotype.Repository;


import com.beans.Ville;
import com.config.JDBCConfiguration;

@Repository
public class VilleDAOImpl implements VilleDAO {
	public ArrayList<Ville> getInfoVille() throws SQLException  {
		Ville ville = null;
		ArrayList<Ville> villes = new ArrayList<>();
		Connection con = JDBCConfiguration.getConnexion();
		ResultSet rs = null;
		Statement stmt = null ;
		

		try {
			stmt = con.createStatement();
			 rs = stmt.executeQuery("SELECT * FROM ville_france");
			while (rs.next()) {
				ville = new Ville(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(6),rs.getString(7),rs.getString(4),rs.getString(5));
				villes.add(ville);
			}
			//con.close();
		} catch (SQLException e) {
			
		}
		finally {
			
			if (stmt != null)
				stmt.close();
			if (rs != null)
				rs.close();
			if (con != null)
				con.close();
		}
		return villes;
	}

	public ArrayList<Ville> getInfoVilles(String code) throws SQLException {
		ArrayList<Ville> villes = new ArrayList<>();
		Ville ville = null;
		ResultSet rs = null;
		Statement stmt = null ;
		String request = "SELECT * FROM ville_france WHERE code_postal = " + code;
		Connection con = JDBCConfiguration.getConnexion();

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(request);
			while (rs.next()) {
				ville = new Ville(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(6),rs.getString(7),rs.getString(4),rs.getString(5));
				villes.add(ville);
			}
			
		} catch (SQLException e) {
			
			
		}
finally {
	
	if (stmt != null)
		stmt.close();
	if (rs != null)
		rs.close();
	if (con != null)
		con.close();
		
		}
		return villes;

	}

	public void setVille(Ville ville) throws SQLException {
		
		Statement stmt = null ;
		Connection con = null ;
		try {
			con = JDBCConfiguration.getConnexion();
			stmt = con.createStatement();
	
		   	stmt.executeUpdate("INSERT INTO `ville_france`(`Code_commune_INSEE`, `Nom_commune`, `Code_postal`, `Libelle_acheminement`, `Ligne_5`, `Latitude`, `Longitude`) VALUES ('"+ville.getCodeCommune()+"','"+ville.getNomCommune()+"','"+ville.getCodePostal()+"','"+ville.getLibelleAcheminement()+"','"+ville.getLigne()+"','"+ville.getlatitude()+"','"+ville.getLongitude()+"')");	
			con.close();
				
					
		} catch (SQLException e) {
			
		}
		finally {
			
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();
		}
		
		
	}
	

	@Override
	public void deleteVille(String code) throws SQLException {

		Statement stmt = null ;
		Connection con = null ;
		try {
			con = JDBCConfiguration.getConnexion();
			stmt = con.createStatement();
			stmt.executeUpdate("DELETE FROM ville_france WHERE Code_commune_INSEE = '" + code + "'");
		} catch (SQLException e) {
			
		}
		finally {
			
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();
		}
	
	}

	public void mettreAJour(Ville ville) throws SQLException {

		Statement stmt = null ;
		Connection con = null ;
		try {
			
			con = JDBCConfiguration.getConnexion();
			stmt = con.createStatement();
			stmt.executeUpdate("UPDATE ville_france SET Nom_commune=' " + ville.getNomCommune() + "', Code_postal='"
					+ ville.getCodePostal() + "', Libelle_acheminement='" + ville.getLibelleAcheminement()
					+ "', Ligne_5 = '" + ville.getLigne() + "', Latitude='" + ville.getlatitude() + "', Longitude='"
					+ ville.getLongitude() + "'  WHERE Code_commune_INSEE='" + ville.getCodeCommune() + "'");
		} catch (SQLException e) {
					}
		finally {
			
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();
		}
	}
}
