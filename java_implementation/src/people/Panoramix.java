package people;

import java.util.Date;

import localisation.Adresse;
import localisation.Registre;

public class Panoramix extends Habitant {

	public Panoramix(String nNIG, String nom, String specialite, String statut, int poids, int année_naissance,
			String mois_naissance, String region_naissance, String village_naissance, Adresse adresse, Date dateNaiss) {
		super(nNIG, nom, specialite, statut, poids, année_naissance, mois_naissance, region_naissance, village_naissance,
				adresse, dateNaiss);
		// TODO Auto-generated constructor stub
	}
	
	public void findInRegister(Registre unRegister) {
		for(Habitant unHabitant : unRegister.getRegistrer()) {
			System.out.println(unHabitant);
		}
	}
	
	
	public Habitant findByNNIG(Registre unRegister, String unNNIG) {
		for(Habitant unHabitant : unRegister.getRegistrer()) {
			if (unHabitant.getNNIG() == unNNIG) {
				System.out.println(unHabitant);
				return unHabitant;
			}
		}
		return null;
	}

}
