package com.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.beans.Ville;
import com.blo.VilleBLO;
import com.dao.VilleDAOImpl;

@RestController 

public class VilleController {

	

		@Autowired
		VilleBLO villeBlo;

		
		@RequestMapping(value = "/ville", method = RequestMethod.GET)
		@ResponseBody
		public ArrayList<Ville> getVille(@RequestParam(required = false, value = "codePostal") String codePostal)
				throws ClassNotFoundException, SQLException {
			ArrayList<Ville> ville = villeBlo.getInfoVille(codePostal);
			return ville;
		}

		
		@RequestMapping(value = "/ville", method = RequestMethod.POST)
		@ResponseBody
		public void postVille(@RequestBody Ville ville) throws ClassNotFoundException, SQLException {
			villeBlo.creerVille(ville);
			
			System.out.println("appel poste" +ville.toString());
			
			
		}

		@RequestMapping(value = "/ville/delete", method = RequestMethod.DELETE)
		@ResponseBody
		public void deleteVille(@RequestParam(required = false, value = "codeInsee") String codeInsee) throws Exception {
			villeBlo.deleteVille(codeInsee);
			System.out.println("appel poste" +codeInsee);
		}
		
		@RequestMapping(value = "/ville/update", method = RequestMethod.PUT)
		@ResponseBody
		public void updateVille(@RequestBody Ville ville) throws ClassNotFoundException, SQLException {
			villeBlo.mettreAJour(ville);
			System.out.println("appel put"+ville.toString());
		}

	
		
	}


