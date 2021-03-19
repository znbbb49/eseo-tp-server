package com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.beans.ConnectionConf;
import com.beans.Ville;
import com.dao.VilleDAOImpl;

@RestController 

public class VilleController {

	//Methode GET
	@ResponseBody
	@GetMapping(value="/ville")

	public List<Ville> appelGet() {
		//System.out.println("Application démarrée") ;
		//return "Applic";
		VilleDAOImpl ville = new VilleDAOImpl() ;
		List <Ville> villes = ville.listeVilles() ;
		
		return villes;
	}
}
