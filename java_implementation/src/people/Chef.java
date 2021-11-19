package people;

import java.util.Date;

import localisation.Adresse;
import localisation.Quartier;
import localisation.Registre;

public class Chef extends Habitant {
	
	private Registre registre;

	public Chef(String nNIG, String nom, String specialite, String statut, int poids, int année_naissance,
			String mois_naissance, String region_naissance, String village_naissance, Adresse adresse, Date dateNaiss) {
		super(nNIG, nom, specialite, statut, poids, année_naissance, mois_naissance, region_naissance, village_naissance,
				adresse, dateNaiss);
		// TODO Auto-generated constructor stub
	}

	public void prevenir(Quartier unQuartier) {
		for (Habitant hab : this.registre.getRegistrer()) {
			if (hab.getAdresse().getQuartier().getNom() == unQuartier.getNom() ) {
				System.out.println("Bonjour, "+hab.getNom()+" sous le numéro "+ hab.getNNIG()+ " invité au combat ");
			}
		}
	}
	
	
	public void prevenirCombattant(Bataille uneBataille) {
		for (Combattant comb : uneBataille.getListeCombatant()) {
			System.out.println("Voici le plan de bataille de , "+comb.getNom()+"  : "+ uneBataille.getPlanBataille());
		}
	}
	
	
	public void planifierPlanBataille(Bataille uneBataille, String plan) {
		uneBataille.setPlanBataille(plan);
	}

}
