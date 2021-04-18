package com.blo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.Ville;
import com.dao.VilleDAO;

@Service
public class VilleBLOImpl implements VilleBLO {
	@Autowired
	private VilleDAO villeDAO;

	public ArrayList<Ville> getInfoVille(String codePostal) {
		ArrayList<Ville> ville = null;
		if (codePostal != null) {
			ville = villeDAO.getInfoVilles(codePostal);
		} else {
			ville = villeDAO.getInfoVille();
		}
		return ville;
	}

	public void creerVille(Ville ville) {
		villeDAO.setVille(ville);
	}

	

	public void deleteVille(String codePostal) {
		villeDAO.deleteVille(codePostal);
	}
	
	public void mettreAJour(Ville ville) {
		villeDAO.mettreAJour(ville);
	}
}
