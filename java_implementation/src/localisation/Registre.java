package localisation;

import java.util.ArrayList;

import people.Habitant;

public class Registre {
	private ArrayList<Habitant> register = new ArrayList<Habitant>();
		
		
	public boolean addHabitant(Habitant unHabitant) {
		if (!this.getRegistrer().contains(unHabitant)) {
			return false;
		}
		
		return this.getRegistrer().add(unHabitant);
	}


	public ArrayList<Habitant> getRegistrer() {
		return register;
	}


	public void setRegistrer(ArrayList<Habitant> registrer) {
		this.register = registrer;
	}
}
