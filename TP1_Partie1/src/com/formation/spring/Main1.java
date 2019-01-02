package com.formation.spring;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main1 {

	public static void main(String[] args) {
		// Recherche du fichier de configuration de Spring
		ClassPathResource cpr=new ClassPathResource("applicationContext.xml");
		
		// Initialisation de la fabrique SPRING, les singletons sont charges
		ListableBeanFactory bf = new XmlBeanFactory(cpr);
		
		// Initialisation de la methode getBean en parametrant le nom du bean
		Adherent adherent1 = (Adherent) bf.getBean("adherent1");
	}

}
