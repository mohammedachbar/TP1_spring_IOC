package com.formation.spring;

public class Livre implements IMedia{
	private String titre;
	private Auteur auteur;
	public Livre() {
		super();
	}
	public Livre(String titre, Auteur auteur) {
		super();
		this.titre = titre;
		this.auteur = auteur;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Auteur getAuteur() {
		return auteur;
	}
	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
	@Override
	public void processusPret() {
			System.out.println("traitement du pret d'un livre"+this.toString());
	}
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + "]";
	}
	
	 

}
