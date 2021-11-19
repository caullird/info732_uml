package potions;

import java.util.Date;

import people.Habitant;

public class PrisePotion {

	private Habitant habitant;
	private int dosePrise;
	private Date datePrise;
	private Potion potion;
	
	public PrisePotion(Habitant habitant, int dosePrise, Date datePrise, Potion potion) {
		super();
		this.habitant = habitant;
		this.dosePrise = dosePrise;
		this.datePrise = datePrise;
		this.potion = potion;
	}

	public Habitant getHabitant() {
		return habitant;
	}
	
	public int getDosePrise() {
		return dosePrise;
	}
	
	public Date getDatePrise() {
		return datePrise;
	}
	
	public Potion getPotion() {
		return potion;
	}
	
	public void setHabitant(Habitant habitant) {
		this.habitant = habitant;
	}
	
	public void setDosePrise(int dosePrise) {
		this.dosePrise = dosePrise;
	}
	
	public void setDatePrise(Date datePrise) {
		this.datePrise = datePrise;
	}
	
	public void setPotion(Potion potion) {
		this.potion = potion;
	}
	
	
}
