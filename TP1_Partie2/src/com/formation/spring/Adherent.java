package com.formation.spring;


public class Adherent {
	private String codeAdherent;
	private String nom,prenom,adresse;
	private IMedia media;
	public Adherent() {
		super();
	}

	public Adherent(String codeAdherent, String nom, String prenom,
			String adresse) {
		super();
		this.codeAdherent = codeAdherent;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

		
	@Override
	public String toString() {
		return "Adherent [codeAdherent=" + codeAdherent + ", nom=" + nom
				+ ", prenom=" + prenom + ", adresse=" + adresse + ", media="
				+ media + "]";
	}

	public String getCodeAdherent() {
		return codeAdherent;
	}
	public void setCodeAdherent(String codeAdherent) {
		this.codeAdherent = codeAdherent;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public IMedia getMedia() {
		return media;
	}

	public void setMedia(IMedia media) {
		this.media = media;
	}

	public void init(){
		System.out.println("init adherent ["+ this.toString()+"]");
	}

}
