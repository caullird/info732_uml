package potions;

public class Potion {

	private String nom;
	private String effet;
	private String intervale_dossage;
	
	public Potion(String nom, String effet, String intervale_dossage) {
		super();
		this.nom = nom;
		this.effet = effet;
		this.intervale_dossage = intervale_dossage;
	}

	public String getNom() {
		return nom;
	}
	
	public String getEffet() {
		return effet;
	}
	
	public String getIntervale_dossage() {
		return intervale_dossage;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setEffet(String effet) {
		this.effet = effet;
	}
	
	public void setIntervale_dossage(String intervale_dossage) {
		this.intervale_dossage = intervale_dossage;
	}
	
	
	
}
