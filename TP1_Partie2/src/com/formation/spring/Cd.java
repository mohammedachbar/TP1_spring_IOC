package com.formation.spring;

public class Cd implements IMedia{
	private double duree;
	
	
	public Cd() {
		super();
	}
	
	public Cd(double duree) {
		super();
		this.duree = duree;
	}

	@Override
	public String toString() {
		return "Cd [duree=" + duree + "]";
	}

	public void processusPret() {
		System.out.println("traitement du pret d'un cd"+this.toString());
		
	}

}
