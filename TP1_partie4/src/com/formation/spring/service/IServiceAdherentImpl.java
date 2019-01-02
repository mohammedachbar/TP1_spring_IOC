package com.formation.spring.service;

import java.util.Collection;

import com.formation.spring.dao.IDaoAdherent;
import com.formation.spring.modele.Adherent;

public class IServiceAdherentImpl implements IServiceAdherent{
	
	private IDaoAdherent dao;

	public String toString() {
		return "IServiceAdherentImpl [dao=" + dao + "]";
	}

	public IDaoAdherent getDao() {
		return dao;
	}

	public void setDao(IDaoAdherent dao) {
		this.dao = dao;
	}

	public void initAdherent() {
		dao.initAdherent();
	}

	public Collection<Adherent> getAllAdherent() {
		return dao.getAllAdherent();
	} 
	

}
