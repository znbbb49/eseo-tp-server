package com.dao;
import java.util.List;

import com.beans.*;


public interface VilleDAO {

	List<Ville> listeVilles() ;
	Ville getVilleByName(String name) ;
	List<String> valueVille() ;
}
