package com.formation.spring;

public class ResponsableRayon {
	private String nom,grade;
	private String rayon;
	
	public ResponsableRayon(String nom, String grade, String rayon) {
		super();
		this.nom = nom;
		this.grade = grade;
		this.rayon = rayon;
	}

	public ResponsableRayon() {
		super();
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getRayon() {
		return rayon;
	}

	public void setRayon(String rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "ResponsableRayon [nom=" + nom + ", grade=" + grade + ", rayon="
				+ rayon + "]";
	}
	
	public void init(){
		System.out.println("init reponsableRayon ["+ this.toString()+"]");
	}
	
	
	
}
