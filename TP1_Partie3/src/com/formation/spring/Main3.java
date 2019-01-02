package com.formation.spring;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main3 {

	public static void main(String[] args) {
		// Recherche du fichier de configuration de Spring
		ClassPathResource cpr= new ClassPathResource("applicationContext.xml");
		
		//Initialisation de la fabrique SPRING, les singletons sont charges
		ListableBeanFactory bf= new XmlBeanFactory(cpr);
		
		//Initiation de la methode getBean en paramettrant le nom du bean
		// responsable1=(ResponsableRayon) bf.getBean("responsable1");
		
		GestionAdherent gestion1 = (GestionAdherent) bf.getBean("gestion1");
		

	}

}