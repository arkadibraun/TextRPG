package Data.Charakter;

import java.util.ArrayList;
import java.util.Iterator;

import Data.Klassen.Klasse;
import Data.Objekte.Item;
import Data.Rasse.Rasse;

public class Charakter {
	
	private String name;
	int exp;// DnD seite als pdf 12 bzw 15 im buch
	
	private int str;
	private int con;
	private int dex;
	private int cha;
	private int wis;
	private int intel;
	private int atk;
	private int armor;
	private int strMod;
	private int conMod;
	private int dexMod;
	private int chaMod;
	private int wisMod;
	private int intMod;
	
	
	
	Object[] stats = new Object[2];
	ArrayList<Item> inv;
	
	public Charakter(String name) {
		this.name = name;
		this.exp=0;
		inv = new ArrayList<Item>();
	}

	public void invAdd(Item item) {
		inv.add(item);
	}
/*
 * ok
 */
	
	
	public void showChar() {
		System.out.printf("Das bist du "+ name + ":\n"
				+ "Du hast "+ ((Klasse) stats[1]).getMoney() + " Münzen\n" );
		System.out.printf("und das ist dein Inventar:\n");
		showInv();
		
		
	}
	public void showInv() {
		for(Item item: inv) {
			System.out.println(item.getName() + "\n" + item.getDescription());
		}
	}

	
	/*
	 * 
	 * BERECHNUNG DER MODIFIKATOREN
	 * 
	 * 
	 */
	
	public void calcModSTR() {
		int sum;
		sum = (int) ((Klasse) stats[1]).getStr() + (int)(((Rasse) stats[0]).getStr())+ getStr();
		
		if(sum == 8 || sum == 9) {
			strMod=-1;
		}else if(sum == 10 || sum == 11) {
			strMod=0;
		}else if(sum == 12|| sum == 13) {
			strMod=1;
		}else if(sum == 14 || sum == 15) {
			strMod=2;
		}else if(sum == 16 || sum == 17) {
			strMod=3;
		}else if(sum == 18 || sum == 19) {
			strMod=4;
		}else if(sum == 20 || sum == 21) {
			strMod=5;
		}else if(sum == 22 || sum == 23) {
			strMod=6;
		}else if(sum == 24 || sum == 25) {
			strMod=7;
		}else if(sum == 26 || sum == 27) {
			strMod=8;
		}else if(sum == 28 || sum == 29) {
			strMod=9;
		}else if(sum >= 30) {
			strMod=10;
		

		}
		
	}
	
	public void calcModKon() {
		int sum;
		sum = (int) ((Klasse) stats[1]).getCon() + (int)(((Rasse) stats[0]).getCon())+ getCon();
		
		if(sum == 8 || sum == 9) {
			conMod=-1;
		}else if(sum == 10 || sum == 11) {
			conMod=0;
		}else if(sum == 12|| sum == 13) {
			conMod=1;
		}else if(sum == 14 || sum == 15) {
			conMod=2;
		}else if(sum == 16 || sum == 17) {
			conMod=3;
		}else if(sum == 18 || sum == 19) {
			conMod=4;
		}else if(sum == 20 || sum == 21) {
			conMod=5;
		}else if(sum == 22 || sum == 23) {
			conMod=6;
		}else if(sum == 24 || sum == 25) {
			conMod=7;
		}else if(sum == 26 || sum == 27) {
			conMod=8;
		}else if(sum == 28 || sum == 29) {
			conMod=9;
		}else if(sum >= 30) {
			conMod=10;
		

		}
		
	}
	
	
	public void calcModDEX() {
		int sum;
		sum = (int) ((Klasse) stats[1]).getDex() + (int)(((Rasse) stats[0]).getDex())+ getDex();
		
		if(sum == 8 || sum == 9) {
			dexMod=-1;
		}else if(sum == 10 || sum == 11) {
			dexMod=0;
		}else if(sum == 12|| sum == 13) {
			dexMod=1;
		}else if(sum == 14 || sum == 15) {
			dexMod=2;
		}else if(sum == 16 || sum == 17) {
			dexMod=3;
		}else if(sum == 18 || sum == 19) {
			dexMod=4;
		}else if(sum == 20 || sum == 21) {
			dexMod=5;
		}else if(sum == 22 || sum == 23) {
			dexMod=6;
		}else if(sum == 24 || sum == 25) {
			dexMod=7;
		}else if(sum == 26 || sum == 27) {
			dexMod=8;
		}else if(sum == 28 || sum == 29) {
			dexMod=9;
		}else if(sum >= 30) {
			dexMod=10;
		

		}
		
	}
	
	
	public void calcModCHA() {
		int sum;
		sum = (int) ((Klasse) stats[1]).getCha() + (int)(((Rasse) stats[0]).getCha())+ getCha();
		
		if(sum == 8 || sum == 9) {
			chaMod=-1;
		}else if(sum == 10 || sum == 11) {
			chaMod=0;
		}else if(sum == 12|| sum == 13) {
			chaMod=1;
		}else if(sum == 14 || sum == 15) {
			chaMod=2;
		}else if(sum == 16 || sum == 17) {
			chaMod=3;
		}else if(sum == 18 || sum == 19) {
			chaMod=4;
		}else if(sum == 20 || sum == 21) {
			chaMod=5;
		}else if(sum == 22 || sum == 23) {
			chaMod=6;
		}else if(sum == 24 || sum == 25) {
			chaMod=7;
		}else if(sum == 26 || sum == 27) {
			chaMod=8;
		}else if(sum == 28 || sum == 29) {
			chaMod=9;
		}else if(sum >= 30) {
			chaMod=10;
		

		}
		
	}
	
	
	
	
	public void calcModWIS() {
		int sum;
		sum = (int) ((Klasse) stats[1]).getWis() + (int)(((Rasse) stats[0]).getWis())+ getWis();
		
		if(sum == 8 || sum == 9) {
			wisMod=-1;
		}else if(sum == 10 || sum == 11) {
			wisMod=0;
		}else if(sum == 12|| sum == 13) {
			wisMod=1;
		}else if(sum == 14 || sum == 15) {
			wisMod=2;
		}else if(sum == 16 || sum == 17) {
			wisMod=3;
		}else if(sum == 18 || sum == 19) {
			wisMod=4;
		}else if(sum == 20 || sum == 21) {
			wisMod=5;
		}else if(sum == 22 || sum == 23) {
			wisMod=6;
		}else if(sum == 24 || sum == 25) {
			wisMod=7;
		}else if(sum == 26 || sum == 27) {
			wisMod=8;
		}else if(sum == 28 || sum == 29) {
			wisMod=9;
		}else if(sum >= 30) {
			wisMod=10;
		

		}
		
	}
	
	
	
	
	public void calcModINT() {
		int sum;
		sum = (int) ((Klasse) stats[1]).getIntel() + (int)(((Rasse) stats[0]).getIntel())+ getIntel();
		
		if(sum == 8 || sum == 9) {
			intMod=-1;
		}else if(sum == 10 || sum == 11) {
			intMod=0;
		}else if(sum == 12|| sum == 13) {
			intMod=1;
		}else if(sum == 14 || sum == 15) {
			intMod=2;
		}else if(sum == 16 || sum == 17) {
			intMod=3;
		}else if(sum == 18 || sum == 19) {
			intMod=4;
		}else if(sum == 20 || sum == 21) {
			intMod=5;
		}else if(sum == 22 || sum == 23) {
			intMod=6;
		}else if(sum == 24 || sum == 25) {
			intMod=7;
		}else if(sum == 26 || sum == 27) {
			intMod=8;
		}else if(sum == 28 || sum == 29) {
			intMod=9;
		}else if(sum >= 30) {
			intMod=10;
		

		}
		
	}
	
	
	
	
	/*
	 * 
	 * RASSEN UND KLASSEN ANNAHME
	 * 
	 */
	public void takeRace(Rasse rasse) {
		stats[0] = rasse;
	}

	public void takeClass(Klasse klasse) {
		stats[1] = klasse;
	}

	/*
	 * HIER KOMMEN DIE GANZEN GETTER UND SETTERS HIN *HINSPUCK GERÄUSCH*
	 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getCha() {
		return cha;
	}

	public void setCha(int cha) {
		this.cha = cha;
	}

	public int getWis() {
		return wis;
	}

	public void setWis(int wis) {
		this.wis = wis;
	}

	public int getIntel() {
		return intel;
	}

	public void setIntel(int intel) {
		this.intel = intel;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getStrMod() {
		return strMod;
	}

	public void setStrMod(int strMod) {
		this.strMod = strMod;
	}

	public int getConMod() {
		return conMod;
	}

	public void setConMod(int conMod) {
		this.conMod = conMod;
	}

	public int getDexMod() {
		return dexMod;
	}

	public void setDexMod(int dexMod) {
		this.dexMod = dexMod;
	}

	public int getChaMod() {
		return chaMod;
	}

	public void setChaMod(int chaMod) {
		this.chaMod = chaMod;
	}

	public int getWisMod() {
		return wisMod;
	}

	public void setWisMod(int wisMod) {
		this.wisMod = wisMod;
	}

	public int getIntMod() {
		return intMod;
	}

	public void setIntMod(int intMod) {
		this.intMod = intMod;
	}

	
	
}
