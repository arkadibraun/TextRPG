package Data.Charakter;

import java.util.ArrayList;
import java.util.Iterator;

import Data.Klassen.Klasse;
import Data.Objekte.Item;
import Data.Objekte.Weapons;
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

	Object[] stats = new Object[2]; // [1] = Klasse, [0] = Rasse
	ArrayList<Item> inv;
	Weapons[] hand = new Weapons[2]; // [1] = Schild, [0] = Waffe

	public Klasse klassse = null;
	public Rasse rassse = null;

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
		calcSkill();

		System.out.printf("Das bist du " + name + ":\n" + "Du hast " + ((Klasse) stats[1]).getMoney() + " Münzen\n");
		System.out.println("Das sind deine Stats:");
		System.out.printf("Lebenspunkte:\t\t" + ((Klasse) stats[1]).getHealth() + "/"
				+ ((Klasse) stats[1]).getMaxHealth() + "\n" + "Stärke:\t\t\t " + calcSTR() + "\t\t Mod: " + calcModSTR()
				+ "\n" + "Konstitution:\t\t " + calcCON() + "\t\t Mod: " + calcModKon() + "\n" + "Geschicklichkeit:\t "
				+ calcDEX() + "\t\t Mod: " + calcModDEX() + "\n" + "Charisma:\t\t " + calcCHA() + "\t\t Mod: "
				+ calcModCHA() + "\n" + "Weisheit:\t\t " + calcWIS() + "\t\t Mod: " + calcModWIS() + "\n"
				+ "Intelligenz:\t\t " + calcINT() + "\t\t Mod: " + calcModINT() + "\n");

		System.out.printf("Dein Inventar:\n");
		showInv();
		System.out.println("--------------------------------------------------------------------------");

	}

	public void showInv() {
		for (Item item : inv) {
			System.out.println(item.getName() + "\n" + item.getDescription());
		}
	}

	/*
	 * 
	 * EQUIPPING
	 * 
	 */

	public void equipWeapon(String name) {

		for (int i = 0; i < inv.size(); i++) {
			if (name.equals(inv.get(i).getName())) {
				if (hand[0] == null) {

					hand[0] = (Weapons) inv.get(i);
					inv.remove(i);
					return;
				} else {
					inv.add(hand[0]);
					hand[0] = (Weapons) inv.get(i);
					inv.remove(i);
					return;
				}
			}
		}

	}

	/*
	 * 
	 * BERECHNUNG DER MODIFIKATOREN
	 * 
	 * 
	 */

	public int calcModSTR() {
		int sum;
		sum = klassse.getStr() + rassse.getStr() + getStr();

		return strMod = zuweisung(sum);
	}

	public int calcModKon() {
		int sum;
		sum = klassse.getCon() + rassse.getCon() + getCon();

		return conMod = zuweisung(sum);

	}

	public int calcModDEX() {
		int sum;
		sum = klassse.getDex() + rassse.getDex() + getDex();

		return dexMod = zuweisung(sum);

	}

	public int calcModCHA() {
		int sum;
		sum = klassse.getCha() + rassse.getCha() + getCha();

		return chaMod = zuweisung(sum);
		// test

	}

	public int calcModWIS() {
		int sum;
		sum = klassse.getWis() + rassse.getWis() + getWis();
		return wisMod = zuweisung(sum);

	}

	public int calcModINT() {
		int sum;
		sum = klassse.getIntel() + rassse.getIntel() + getIntel();
		return intMod = zuweisung(sum);

	}

	public int zuweisung(int sum) {
		int mod = 0;
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
	 * BERECHNUNG DER SKILLPUNKTE
	 * 
	 * 
	 */

	public void calcSkill() {
		calcSTR();
		calcCON();
		calcDEX();
		calcCHA();
		calcWIS();
		calcINT();
	}

	public int calcSTR() {
		int sum;
		setStr(getStr());
		sum = klassse.getStr() + rassse.getStr() + getStr();

		return sum;

	}

	public int calcCON() {
		int sum;
		setCon(getCon());
		sum = klassse.getCon() +rassse.getCon() + getCon();

		return sum;
	}

	public int calcDEX() {
		int sum;
		setDex(getDex());
		sum = klassse.getDex() + rassse.getDex() + getDex();

		return sum;

	}

	public int calcCHA() {
		int sum;
		setCha(getCha());
		sum = klassse.getCha() + rassse.getCha() + getCha();
		return sum;

	}

	public int calcWIS() {
		int sum;
		setWis(getWis());
		sum = klassse.getWis() + rassse.getWis() + getWis();

		return sum;

	}

	public int calcINT() {
		int sum;
		setIntel(getIntel());
		sum = klassse.getIntel() + rassse.getIntel() + getIntel();

		return sum;
	}

	/*
	 * 
	 * RASSEN UND KLASSEN ANNAHME
	 * 
	 */
	public void takeRace(Rasse rasse) {
		stats[0] = rasse;
		this.rassse = rasse;
	}

	public void takeClass(Klasse klasse) {
		stats[1] = klasse;
		this.klassse = klasse;
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
