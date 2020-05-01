package Data.Charakter;

import java.util.ArrayList;
import java.util.Iterator;

import Data.Klassen.Klasse;
import Data.Objekte.Item;
import Data.Rasse.Rasse;

public class Charakter {
	
	private String name;
	Object[] stats = new Object[2];
	ArrayList<Item> inv;
	
	public Charakter(String name) {
		this.name = name;
		inv = new ArrayList<Item>();
	}

	public void invAdd(Item item) {
		inv.add(item);
	}

	public void showInv() {
		for(Item item: inv) {
			System.out.println(item.getName() + "\n" + item.getDescription());
		}
	}

	public void takeRace(Rasse rasse) {
		stats[0] = rasse;
	}

	public void takeClass(Klasse klasse) {
		stats[1] = klasse;
	}

}
