package museum;

import java.util.ArrayList;

public class Musee {

	private String nom;
	private ArrayList<Casque> listeCasque = new ArrayList<Casque>();
	
	public Musee(String nom, ArrayList<Casque> listeCasque) {
		super();
		this.nom = nom;
		this.listeCasque = listeCasque;
	}

	public String getNom() {
		return nom;
	}
	
	public ArrayList<Casque> getListeCasque() {
		return listeCasque;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setListeCasque(ArrayList<Casque> listeCasque) {
		this.listeCasque = listeCasque;
	}
	
	
	
}
