package com.blo;

import java.util.ArrayList;

import com.beans.Ville;



public interface VilleBLO {

	public ArrayList<Ville> getInfoVille(String codePostal);

	public void creerVille(Ville ville);

	public void deleteVille(String codePostal);
	
	public void mettreAJour(Ville ville);

}
