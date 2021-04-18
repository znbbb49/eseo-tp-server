package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.beans.Ville;
import com.config.JDBCConfiguration;

@Repository
public class VilleDAOImpl implements VilleDAO {
	public ArrayList<Ville> getInfoVille() {
		Ville ville = null;
		ArrayList<Ville> villes = new ArrayList<Ville>();
		Connection con = JDBCConfiguration.getConnexion();

		

		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ville_france");
			while (rs.next()) {
				ville = new Ville(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(6),rs.getString(7),rs.getString(4),rs.getString(5));
				villes.add(ville);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return villes;
	}

	public ArrayList<Ville> getInfoVilles(String code) {
		ArrayList<Ville> villes = new ArrayList<Ville>();
		Ville ville = null;

		String request = "SELECT * FROM ville_france WHERE code_postal = " + code;
		Connection con = JDBCConfiguration.getConnexion();

		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(request);
			while (rs.next()) {
				ville = new Ville(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(6),rs.getString(7),rs.getString(4),rs.getString(5));
				villes.add(ville);
			}
			return villes;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	public void setVille(Ville ville) {
		try {
			Connection con = JDBCConfiguration.getConnexion();
			Statement stmt = con.createStatement();
			//String r ="INSERT INTO `ville_france`(`Code_commune_INSEE`, `Nom_commune`, `Code_postal`, `Libelle_acheminement`, `Ligne_5`, `Latitude`, `Longitude`) VALUES ('2','','','','','','')";
			String req = "INSERT INTO `ville_france`(`Code_commune_INSEE`, `Nom_commune`, `Code_postal`, `Libelle_acheminement`, `Ligne_5`, `Latitude`, `Longitude`) VALUES ('"+ville.getCodeCommune()+"','"+ville.getNomCommune()+"','"+ville.getCodePostal()+"','"+ville.getLibelleAcheminement()+"','"+ville.getLigne()+"','"+ville.getlatitude()+"','"+ville.getLongitude()+"')";
			String requeteCreation = "INSERT INTO ville_france(Code_commune_INSEE,Nom_commune,Code_postal,Libelle_acheminement,Ligne_5,Latitude,Longitude)"
					+ " values(" + ville.getCodeCommune() + ",'" + ville.getNomCommune() + "',"
					+ ville.getCodePostal() + ",'"
							+ ville.getLibelleAcheminement() + "','" + ville.getLigne() + "'," + ville.getlatitude() + ","
					 + ville.getLongitude() + ")";		
	
		   	stmt.executeUpdate(req);	
			con.close();
				
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	

	@Override
	public void deleteVille(String code) {
		try {
			Connection con = JDBCConfiguration.getConnexion();
			Statement stmt = con.createStatement();
			String request = "DELETE FROM ville_france WHERE Code_commune_INSEE = '" + code + "'";
			stmt.executeUpdate("DELETE FROM ville_france WHERE Code_commune_INSEE = '" + code + "'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

	public void mettreAJour(Ville ville) {
		try {
			System.out.println(ville.getCodeCommune());
			Connection con = JDBCConfiguration.getConnexion();
			Statement stmt = con.createStatement();
			String request = "UPDATE ville_france SET Nom_commune=' " + ville.getNomCommune() + "', Code_postal='"
					+ ville.getCodePostal() + "', Libelle_acheminement='" + ville.getLibelleAcheminement()
					+ "', Ligne_5 = '" + ville.getLigne() + "', Latitude='" + ville.getlatitude() + "', Longitude='"
					+ ville.getLongitude() + "'  WHERE Code_commune_INSEE=' " + ville.getCodeCommune() + "'" ;
			stmt.executeUpdate("UPDATE ville_france SET Nom_commune=' " + ville.getNomCommune() + "', Code_postal='"
					+ ville.getCodePostal() + "', Libelle_acheminement='" + ville.getLibelleAcheminement()
					+ "', Ligne_5 = '" + ville.getLigne() + "', Latitude='" + ville.getlatitude() + "', Longitude='"
					+ ville.getLongitude() + "'  WHERE Code_commune_INSEE='" + ville.getCodeCommune() + "'");

			System.out.println(stmt.executeUpdate("UPDATE ville_france SET Nom_commune=' " + ville.getNomCommune() + "', Code_postal='"
					+ ville.getCodePostal() + "', Libelle_acheminement='" + ville.getLibelleAcheminement()
					+ "', Ligne_5 = '" + ville.getLigne() + "', Latitude='" + ville.getlatitude() + "', Longitude='"
					+ ville.getLongitude() + "'  WHERE Code_commune_INSEE='" + ville.getCodeCommune() + "'"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
