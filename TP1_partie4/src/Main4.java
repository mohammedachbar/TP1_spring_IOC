
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.formation.spring.modele.Adherent;
import com.formation.spring.service.IServiceAdherentImpl;

public class Main4 {

	public static void main(String[] args) {
		// Recherche du fichier de configuration de Spring
		ClassPathResource cpr= new ClassPathResource("applicationContext.xml");
		
		//Initialisation de la fabrique SPRING, les singletons sont charges
		ListableBeanFactory bf= new XmlBeanFactory(cpr);
		
		//Initiation de la methode getBean en paramettrant le nom du bean
		// responsable1=(ResponsableRayon) bf.getBean("responsable1");
		IServiceAdherentImpl sa = (IServiceAdherentImpl) bf.getBean("service");
		
		System.out.println(sa.getAllAdherent().size());
		ArrayList<Adherent> liste = (ArrayList<Adherent>) sa.getAllAdherent();
		
		for (Adherent elem : liste) {
	        System.out.println(elem.toString());
	    }
		

	}

}