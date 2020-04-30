package Data.Charakter;

import Data.Klassen.Klasse;
import Data.Rasse.Rasse;

public class Charakter {

	private String name;
	
	Object[] stats;
	
	public void takeRace(Rasse rasse) {
		stats[0]= rasse;
	}
	
	public void takeClass(Klasse klasse) {
		stats[1]= klasse;
	}
	public Charakter(String name) {
	
		
		
	}
}
