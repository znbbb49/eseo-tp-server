package com.blo;

import java.sql.SQLException;
import java.util.ArrayList;

import com.beans.Ville;



public interface VilleBLO {

	public ArrayList<Ville> getInfoVille(String codePostal) throws SQLException;

	public void creerVille(Ville ville) throws SQLException;

	public void deleteVille(String codePostal) throws SQLException;
	
	public void mettreAJour(Ville ville) throws SQLException;

}
