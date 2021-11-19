package museum;

import people.Bataille;

public class Casque {

	private Bataille idBataille;
	private String type;
	private String etat;
	private String grade;
	private String statut;
	private boolean enService;
	

	public Casque(Bataille idBataille, String type, String etat, String grade, String statut, boolean enService) {
		super();
		this.idBataille = idBataille;
		this.type = type;
		this.etat = etat;
		this.grade = grade;
		this.statut = statut;
		this.enService = enService;
	}

	public Bataille getIdBataille() {
		return idBataille;
	}
	
	public String getType() {
		return type;
	}
	
	public String getEtat() {
		return etat;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public String getStatut() {
		return statut;
	}
	
	public boolean isEnService() {
		return enService;
	}
	
	public void setIdBataille(Bataille idBataille) {
		this.idBataille = idBataille;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	public void setEnService(boolean enService) {
		this.enService = enService;
	}

}
