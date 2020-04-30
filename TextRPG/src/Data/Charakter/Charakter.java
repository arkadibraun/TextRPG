package Data.Charakter;

import java.util.ArrayList;
import java.util.Iterator;

import Data.Klassen.Klasse;
import Data.Objekte.Item;
import Data.Rasse.Rasse;

public class Charakter {

	private String name;
	Object[] stats = new Object[2];
	ArrayList<Item> inv = new ArrayList<Item>();
	Iterator<Item> iterator = inv.iterator();
	
	public void invAdd(Item item) {
		inv.add(item);
	}
	
	
	public void showInv() {
		while(iterator.hasNext()) {
			System.out.println();
		}
	}
	
	
	
	public void takeRace(Rasse rasse) {
		stats[0]= rasse;
	}
	
	public void takeClass(Klasse klasse) {
		stats[1]= klasse;
	}
	public Charakter(String name) {
	
		
		
	}
}
