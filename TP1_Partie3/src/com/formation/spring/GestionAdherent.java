package com.formation.spring;

import java.util.List;
import java.util.Map;

public class GestionAdherent {

	private List<Adherent> adherents;
	private Map<String,ResponsableRayon> responsables;
	
	public List<Adherent> getAdherents() {
		return adherents;
	}
	public void setAdherents(List<Adherent> adherents) {
		this.adherents = adherents;
	}
	public Map<String, ResponsableRayon> getResponsables() {
		return responsables;
	}
	public void setResponsables(Map<String, ResponsableRayon> responsables) {
		this.responsables = responsables;
	}
	@Override
	public String toString() {
		return "GestionAdherent [adherents=" + adherents + ", responsables="
				+ responsables + "]";
	}
	
	
	
	
	
	
}
