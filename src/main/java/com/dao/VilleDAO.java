package com.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.beans.*;



public interface VilleDAO {
	public ArrayList<Ville> getInfoVille() throws SQLException;

	public void setVille(Ville ville) throws SQLException;

	public ArrayList<Ville> getInfoVilles(String param) throws SQLException;

	public void mettreAJour(Ville ville) throws SQLException;

	public void deleteVille(String codePostal) throws SQLException;
}
