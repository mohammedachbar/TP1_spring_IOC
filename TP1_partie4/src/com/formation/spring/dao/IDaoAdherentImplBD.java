package com.formation.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.formation.spring.modele.Adherent;
import com.formation.spring.utils.ConexionBD;

public class IDaoAdherentImplBD implements IDaoAdherent{
	private ConexionBD bd = new ConexionBD();
	private ArrayList<Adherent> liste = new ArrayList<Adherent>();
	
	public void initAdherent() {
		bd.connect();
		
	}

	public Collection<Adherent> getAllAdherent() {
		ResultSet result = bd.select("select * from adherent");
		Adherent a1 ;
		try{
			while(result.next()){
				a1=new Adherent();
				a1.setCodeAdherent(result.getString(1));
				a1.setNom(result.getString(2));
				a1.setPrenom(result.getString(3));
				a1.setAdresse(result.getString(4));
				liste.add(a1);
			}
		}
		catch (SQLException e){
			e.printStackTrace();
			
		}
		return liste;
	}

}
