package com.blo;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.Ville;
import com.dao.VilleDAO;

@Service
public class VilleBLOImpl implements VilleBLO {
	@Autowired
	private VilleDAO villeDAO;

	public ArrayList<Ville> getInfoVille(String codePostal) throws SQLException {
		ArrayList<Ville> ville = null;
		if (codePostal != null) {
			ville = villeDAO.getInfoVilles(codePostal);
		} else {
			ville = villeDAO.getInfoVille();
		}
		return ville;
	}

	public void creerVille(Ville ville) throws SQLException {
		villeDAO.setVille(ville);
	}

	

	public void deleteVille(String codePostal) throws SQLException {
		villeDAO.deleteVille(codePostal);
	}
	
	public void mettreAJour(Ville ville) throws SQLException {
		villeDAO.mettreAJour(ville);
	}
}
