package localisation;

public class Adresse {

	private Quartier quartier;
	private String voie;
	private int numero;
	
	
	public Adresse(Quartier unQuartier, String uneVoie, int unNum�ro) {
		this.quartier = unQuartier;
		this.voie = uneVoie;
		this.numero = unNum�ro;
	}


	public Quartier getQuartier() {
		return quartier;
	}


	public String getVoie() {
		return voie;
	}


	public int getNumero() {
		return numero;
	}
	
}
