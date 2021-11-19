package people;

import java.util.ArrayList;
import java.util.Date;

public class Bataille {

	private String nom;
	private String planBataille;
	private Date dateDebut;
	private Date dateFin;
	private String lieu;
	
	private ArrayList<Combattant> listeCombatant = new ArrayList<Combattant>();
	
	public Bataille(String nom, String planBataille, Date dateDebut, Date dateFin, String lieu,
			ArrayList<Combattant> listeCombatant) {
		super();
		this.nom = nom;
		this.planBataille = planBataille;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.lieu = lieu;
		this.listeCombatant = listeCombatant;
	}
	
	public boolean addCombattant(Combattant c) {
		if (listeCombatant.contains(c)) {
			return false;
		}
		return this.listeCombatant.add(c);
	}

	public String getNom() {
		return nom;
	}

	public String getPlanBataille() {
		return planBataille;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public String getLieu() {
		return lieu;
	}

	public ArrayList<Combattant> getListeCombatant() {
		return listeCombatant;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPlanBataille(String planBataille) {
		this.planBataille = planBataille;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public void setListeCombatant(ArrayList<Combattant> listeCombatant) {
		this.listeCombatant = listeCombatant;
	}
	
	
	
}
