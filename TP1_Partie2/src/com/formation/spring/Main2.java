package com.formation.spring;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main2 {

	public static void main(String[] args) {
		// Recherche du fichier de configuration de Spring
		ClassPathResource cpr= new ClassPathResource("applicationContext.xml");
		
		//Initialisation de la fabrique SPRING, les singletons sont charges
		ListableBeanFactory bf= new XmlBeanFactory(cpr);
		
		//Initiation de la methode getBean en paramettrant le nom du bean
		Adherent adherent1 = (Adherent) bf.getBean("adherent1");
		
		
//		// Tester le Bean est Singleton==>Oui, On aura une instance unique car singleton="true" par défaut
//		Adherent adherent21 = (Adherent) bf.getBean("adherent1");
//		
		
		//Adherent adherent2 = (Adherent) bf.getBean("adherent2");
	
		

	}
}