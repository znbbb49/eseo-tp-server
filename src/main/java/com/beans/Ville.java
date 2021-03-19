package com.beans;


public class Ville {
	
	private String codeCommune ;
	private String nomCommune ;
	private String codePostal ;
	private String lattitute ;
	private String longitude ;
	
	
	
	public Ville(String codeCommune, String nomCommune, String codePostal, String lattitute, String longitude) {
		super();
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.codePostal = codePostal;
		this.lattitute = lattitute;
		this.longitude = longitude;
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
	public String getLattitute() {
		return lattitute;
	}
	public void setLattitute(String lattitute) {
		this.lattitute = lattitute;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return "Ville [codeCommune=" + codeCommune + ", nomCommune=" + nomCommune + ", codePostal=" + codePostal
				+ ", lattitute=" + lattitute + ", longitude=" + longitude + "]";
	}
	
	
	
	
	
}
