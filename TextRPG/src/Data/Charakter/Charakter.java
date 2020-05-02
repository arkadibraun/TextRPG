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
		this.exp = 0;
		inv = new ArrayList<Item>();
	}

	public void invAdd(Item item) {
		inv.add(item);
	}
	/*
	 * 
	 * PRINTY THINGS SHOWING DATAAAAAAAAAAAAAHH
	 * 
	 */

	public void showChar() {
		System.out.printf("Das bist du " + name + ":\n" + "Du hast " + ((Klasse) stats[1]).getMoney() + " Münzen\n");
		System.out.println("Das sind deine Stats:");
		System.out.printf("Stärke:\t\t\t " + getStr() + "\t\t Mod: "+ getStrMod() + "\n"+
							"Konstitution:\t\t " + getCon() + "\t\t Mod: "+ getConMod() + "\n"+
							"Geschicklichkeit:\t " + getDex() + "\t\t Mod: "+ getDexMod() + "\n"+
							"Charisma:\t\t " + getCha() + "\t\t Mod: "+ getChaMod() + "\n"+
							"Weisheit:\t\t " + getWis() + "\t\t Mod: "+ getWisMod() + "\n"+
							"Intelligenz:\t\t " + getIntel() + "\t\t Mod: "+ getIntMod() + "\n");
		
		System.out.printf("und das ist dein Inventar:\n");
		showInv();
		System.out.println("--------------------------------------------------------------------------");

	}

	public void showInv() {
		for (Item item : inv) {
			System.out.println(item.getName() +"\n" + item.getDescription());
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
		sum = (int) ((Klasse) stats[1]).getStr() + (int) (((Rasse) stats[0]).getStr()) + getStr();

		strMod = zuweisung(sum);
	}

	public void calcModKon() {
		int sum;
		sum = (int) ((Klasse) stats[1]).getCon() + (int) (((Rasse) stats[0]).getCon()) + getCon();

		conMod = zuweisung(sum);

	}

	public void calcModDEX() {
		int sum;
		sum = (int) ((Klasse) stats[1]).getDex() + (int) (((Rasse) stats[0]).getDex()) + getDex();

		dexMod = zuweisung(sum);

	}

	public void calcModCHA() {
		int sum;
		sum = (int) ((Klasse) stats[1]).getCha() + (int) (((Rasse) stats[0]).getCha()) + getCha();

		chaMod = zuweisung(sum);

	}

	public void calcModWIS() {
		int sum;
		sum = (int) ((Klasse) stats[1]).getWis() + (int) (((Rasse) stats[0]).getWis()) + getWis();

		wisMod = zuweisung (sum);

	}

	public void calcModINT() {
		int sum;
		sum = (int) ((Klasse) stats[1]).getIntel() + (int) (((Rasse) stats[0]).getIntel()) + getIntel();

		intMod = zuweisung(sum);

	}
	
	
	public int zuweisung(int sum) {
		int mod =0;
		if (sum == 8 || sum == 9) {
			mod = -1;
		} else if (sum == 10 || sum == 11) {
			mod = 0;
		} else if (sum == 12 || sum == 13) {
			mod = 1;
		} else if (sum == 14 || sum == 15) {
			mod = 2;
		} else if (sum == 16 || sum == 17) {
			mod = 3;
		} else if (sum == 18 || sum == 19) {
			mod = 4;
		} else if (sum == 20 || sum == 21) {
			mod = 5;
		} else if (sum == 22 || sum == 23) {
			mod = 6;
		} else if (sum == 24 || sum == 25) {
			mod = 7;
		} else if (sum == 26 || sum == 27) {
			mod = 8;
		} else if (sum == 28 || sum == 29) {
			mod = 9;
		} else if (sum >= 30) {
			mod = 10;

		}
		
		return mod;
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
