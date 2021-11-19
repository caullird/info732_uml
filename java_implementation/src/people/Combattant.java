package people;

import java.util.Date;

import localisation.Adresse;

public class Combattant extends Habitant {

	public Combattant(String nNIG, String nom, String specialite, String statut, int poids, int année_naissance,
			String mois_naissance, String region_naissance, String village_naissance, Adresse adresse, Date dateNaiss) {
		super(nNIG, nom, specialite, statut, poids, année_naissance, mois_naissance, region_naissance, village_naissance,
				adresse, dateNaiss);
		// TODO Auto-generated constructor stub
	}
	
	public boolean participeBataille(Bataille uneBataille) {
		System.out.println(this.getNom()+" ["+this.getNNIG()+"] souhaite participer a la bataille "+ uneBataille.getNom());
		return uneBataille.addCombattant(this);
	}

}
