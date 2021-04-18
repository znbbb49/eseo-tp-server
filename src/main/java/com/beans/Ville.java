package com.beans;



public class Ville {
	
	private String codeCommune ;
	private String nomCommune ;
	private String codePostal ;
	private String latitude ;
	private String longitude ;
	private String libelleAcheminement ;
	private String ligne ;
	
	public Ville() {
		super();
	}
	
	public Ville(String codeCommune, String nomCommune, String codePostal, String latitude, String longitude, String libelleAcheminement, String ligne) {
		super();
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.codePostal = codePostal;
		this.latitude = latitude;
		this.longitude = longitude;
		this.libelleAcheminement = libelleAcheminement ;
		this.ligne = ligne ;
	}
	public String getCodeCommune() {
		return codeCommune;
	}
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}
	public String getNomCommune() {
		return nomCommune;
	}
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getlatitude() {
		return latitude;
	}
	public void setlatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	

	public String getLibelleAcheminement() {
		return libelleAcheminement;
	}

	public void setLibelleAcheminement(String libelleAcheminement) {
		this.libelleAcheminement = libelleAcheminement;
	}

	public String getLigne() {
		return ligne;
	}

	public void setLigne(String ligne) {
		this.ligne = ligne;
	}

	@Override
	public String toString() {
		return "Ville [codeCommune=" + codeCommune + ", nomCommune=" + nomCommune + ", codePostal=" + codePostal
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", libelleAcheminement="
				+ libelleAcheminement + ", ligne=" + ligne + "]";
	}
	
	
	
	
	
	
	
}
