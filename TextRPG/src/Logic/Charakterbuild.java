package Logic;

import Data.Charakter.Charakter;
import Data.Rasse.*;
import Data.Klassen.*;
import Data.Objekte.*;


import java.util.Scanner;

public class Charakterbuild {

	Charakter charakter;
	Scanner scanner = new Scanner(System.in);

	public void create() {

		System.out.println("Bitte nenne mir deinen Namen:");
		String name = scanner.next();
		charakter = new Charakter(name);
		System.out.println("Wilkommen " + name + " in der Welt von Ravnica. Nimm dich vor Gefahren in Acht");
		pickARace();
		pickAClass();
		charakter.showInv();
	}

	public void pickARace() {
	 boolean entry = true;
		System.out.printf(
				"Bitte wähle eine Rasse aus\n 1)Zwerg(+2 STR, +1 KON, +1 CHA, +1WEI"
				+ "\n 2)Elf(+2 GES, +1 WEI, +2 INT \n"
				+ " 3)Goblin(+1 KON, +2 GES, +1 WEI, +1 INT \n"
				+ " 4)Mensch(+1 ALLES) \n"
				+ " 5)Ork(+2 STR, +2 KON, +1 WEI) \n"
				+ " 6)Besessener(+1 ALLES) \n");
		do {
		switch (scanner.nextInt()) {
		case 1:
			System.out.println("Du Bist nun ein Zwerg, wähle bitte nun eine Klasse-->");
			charakter.takeRace(new Dwarf(0,2,1,0,1,1,0));
			break;
		case 2:
			System.out.println("Du Bist nun ein Elf, wähle bitte nun eine Klasse-->");
			charakter.takeRace(new Elf(2,0,0,2,0,1,2));
			break;
		case 3:
			System.out.println("Du Bist nun ein Goblin, wähle bitte nun eine Klasse-->");
			charakter.takeRace(new Goblin(0,0,1,2,0,1,1));
			break;
		case 4:
			System.out.println("Du Bist nun ein Mensch, wähle bitte nun eine Klasse-->");
			charakter.takeRace(new Human(1, 1, 1, 1, 1, 1, 1));
			break;
		case 5:
			System.out.println("Du Bist nun ein Ork, wähle bitte nun eine Klasse-->");
			charakter.takeRace(new Orc(2, 2, 2, 0, 0, 1, 0));
			break;
		case 6:
			System.out.println("Du Bist nun ein Besessener, wähle bitte nun eine Klasse-->");
			charakter.takeRace(new Possessed(1, 1, 1, 1, 1, 1, 1));
			break;
		default:
			System.out.println("Bitte eine gültige Eingabe zwischen 1 und 6 machen");
			entry = false;

		}
		}while(entry==false);
	}

	public void pickAClass() {
		boolean entry = true;
		System.out.printf(
				"Bitte wähle eine Klasse aus\n 1)Barbar\n 2)Magier \n 3)Paladain \n 4)Priester \n 5)Ranger \n 6)Schurke \n 7)Hexenmeister \n 8)Krieger \n");
		
		do {
		switch (scanner.nextInt()) {
		case 1:
			System.out.println("Du Bist nun ein Barbar");
			charakter.takeClass(new Barbar());
			charakter.invAdd(new Axe());
			break;
		case 2:
			System.out.println("Du Bist nun ein Magier");
			charakter.takeClass(new Mage());
			charakter.invAdd(new Staff());
			break;
		case 3:
			System.out.println("Du Bist nun ein Paladin");
			charakter.takeClass(new Paladin());
			charakter.invAdd(new Maul());
			break;
		case 4:
			System.out.println("Du Bist nun ein Priester");
			charakter.takeClass(new Priest());
			charakter.invAdd(new Staff());
			break;
		case 5:
			System.out.println("Du Bist nun ein Ranger");
			charakter.takeClass(new Ranger());
			charakter.invAdd(new Bow());
			break;
		case 6:
			System.out.println("Du Bist nun ein Schurke");
			charakter.takeClass(new Rogue());
			charakter.invAdd(new Dagger());
			break;
		case 7:
			System.out.println("Du Bist nun ein Hexenmeister");
			charakter.takeClass(new Warlock());
			charakter.invAdd(new Staff());
			break;
		case 8:
			System.out.println("Du Bist nun ein Krieger");
			charakter.takeClass(new Warrior());
			charakter.invAdd(new Sword());
			charakter.invAdd(new Shield());
			break;
		default:
			System.out.println("Bitte eine gültige Eingabe zwischen 1 und 8 machen");
			pickAClass();
			entry = false;
		}
		}while (entry == false);
	}

}
