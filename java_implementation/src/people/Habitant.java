package people;

import java.util.ArrayList;
import java.util.Date;

import localisation.Adresse;
import museum.Casque;

public class Habitant {
	
	// Informations par défaut d'un habitant
	private String NNIG;
	private String nom;
	private String specialite;
	private String statut;
	private int poids;
	private int année_naissance;
	private String mois_naissance;
	private String region_naissance;
	private String village_naissance;
	
	// Informations externes
	private Adresse adresse;
	private Date dateNaiss;
	
	private ArrayList<Casque> listCasque = new ArrayList<Casque>();
	
	
	public Habitant(String nNIG, String nom, String specialite, String statut, int poids, int année_naissance,
			String mois_naissance, String region_naissance, String village_naissance, Adresse adresse, Date dateNaiss) {
		super();
		this.NNIG = nNIG;
		this.nom = nom;
		this.specialite = specialite;
		this.statut = statut;
		this.poids = poids;
		this.année_naissance = année_naissance;
		this.mois_naissance = mois_naissance;
		this.region_naissance = region_naissance;
		this.village_naissance = village_naissance;
		this.adresse = adresse;
		this.dateNaiss = dateNaiss;
	}
	
	public boolean getCasque(Casque unCasque) {
		if(listCasque.contains(unCasque)) {
			return false;
		}
		return this.listCasque.add(unCasque);
	}

	public String getNNIG() {
		return NNIG;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getSpecialite() {
		
		return specialite;
	}
	public String getStatut() {
		return statut;
	}
	
	public int getPoids() {
		return poids;
	}
	
	public int getAnnée_naissance() {
		return année_naissance;
	}
	
	public String getMois_naissance() {
		return mois_naissance;
	}
	
	public String getRegion_naissance() {
		return region_naissance;
	}
	
	public String getVillage_naissance() {
		return village_naissance;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	
	public Date getDateNaiss() {
		return dateNaiss;
	}
	
	public void setNNIG(String nNIG) {
		NNIG = nNIG;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	public void setAnnée_naissance(int année_naissance) {
		this.année_naissance = année_naissance;
	}
	
	public void setMois_naissance(String mois_naissance) {
		this.mois_naissance = mois_naissance;
	}
	
	public void setRegion_naissance(String region_naissance) {
		this.region_naissance = region_naissance;
	}
	
	public void setVillage_naissance(String village_naissance) {
		this.village_naissance = village_naissance;
	}
	
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	public ArrayList<Casque> getListCasque() {
		return listCasque;
	}

	public void setListCasque(ArrayList<Casque> listCasque) {
		this.listCasque = listCasque;
	}
	
}
