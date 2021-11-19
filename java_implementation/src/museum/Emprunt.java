package museum;

import java.util.ArrayList;
import java.util.Date;

import people.Habitant;

public class Emprunt {
	
	private Habitant nbNNIG;
	private Date dateEmprunt;
	private String lieu;
	
	private ArrayList<Casque> listeCasque = new ArrayList<Casque>();

	public Emprunt(Habitant nbNNIG, Date dateEmprunt, String lieu, ArrayList<Casque> listeCasque) {
		super();
		this.nbNNIG = nbNNIG;
		this.dateEmprunt = dateEmprunt;
		this.lieu = lieu;
		this.listeCasque = listeCasque;
	}

	public Habitant getNbNNIG() {
		return nbNNIG;
	}

	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public String getLieu() {
		return lieu;
	}

	public ArrayList<Casque> getListeCasque() {
		return listeCasque;
	}

	public void setNbNNIG(Habitant nbNNIG) {
		this.nbNNIG = nbNNIG;
	}

	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public void setListeCasque(ArrayList<Casque> listeCasque) {
		this.listeCasque = listeCasque;
	}
	
	
	
}
