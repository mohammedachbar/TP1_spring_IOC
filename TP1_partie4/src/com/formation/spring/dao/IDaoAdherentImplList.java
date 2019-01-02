package com.formation.spring.dao;

import java.util.ArrayList;
import java.util.Collection;

import com.formation.spring.modele.Adherent;

public class IDaoAdherentImplList implements IDaoAdherent {

	private ArrayList<Adherent> liste = new ArrayList<Adherent>();

	public void initAdherent() {
		Adherent a1 = new Adherent("c100","mohamed","ali","rabat");
		Adherent a2 = new Adherent("c200","hamid","mohamed","rabat");
		liste.add(a1);
		liste.add(a2);

	}

	public Collection<Adherent> getAllAdherent() {
		return liste;
	}

	public String toString() {
		return "IDaoAdherentImplList [liste=" + liste + "et taille" + liste.size() + "]";
	}

	
}
