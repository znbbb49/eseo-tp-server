package com.dao;
import java.util.ArrayList;
import java.util.List;

import com.beans.*;



public interface VilleDAO {
	public ArrayList<Ville> getInfoVille();

	public void setVille(Ville ville);

	public ArrayList<Ville> getInfoVilles(String param);

	public void mettreAJour(Ville ville);

	public void deleteVille(String codePostal);
}
