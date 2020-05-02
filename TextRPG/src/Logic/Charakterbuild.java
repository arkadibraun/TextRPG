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
		System.out.println("--------------------------------------------------------------------------");
		pickAClass();
		System.out.println("--------------------------------------------------------------------------");
		punkteverteilen();
	}

	public void pickARace() {
		int eingabe = 0;
		while (eingabe == 0) {
			System.out.printf("Bitte wähle eine Rasse aus\n" + " 1)Zwerg \t\t (+2 STR, +1 KON, +1 CHA, +1WEI)\n"
					+ " 2)Elf \t\t\t (+2 GES, +1 WEI, +2 INT) \n" + " 3)Goblin \t\t (+1 KON, +2 GES, +1 WEI, +1 INT) \n"
					+ " 4)Mensch \t\t (+1 ALLES) \n" + " 5)Ork \t\t\t (+2 STR, +2 KON, +1 WEI) \n"
					+ " 6)Besessener \t\t (+1 ALLES) \n");
			eingabe = scanner.nextInt();
			switch (eingabe) {
			case 1:
				System.out.println("Du Bist nun ein Zwerg, wähle bitte nun eine Klasse-->");
				charakter.takeRace(new Dwarf(0, 2, 1, 0, 1, 1, 0));
				break;
			case 2:
				System.out.println("Du Bist nun ein Elf, wähle bitte nun eine Klasse-->");
				charakter.takeRace(new Elf(2, 0, 0, 2, 0, 1, 2));
				break;
			case 3:
				System.out.println("Du Bist nun ein Goblin, wähle bitte nun eine Klasse-->");
				charakter.takeRace(new Goblin(0, 0, 1, 2, 0, 1, 1));
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
				pickARace();
				eingabe = 1;
			}
		}
	}

	public void pickAClass() {
		int eingabe = 0;
		while (eingabe == 0) {
			System.out.printf(
					"Bitte wähle eine Klasse aus\n" + " 1)Barbar \t\t (14 AC, +2 HP, +1 STR, +1 KON, 500 Münzen) \n"
							+ " 2)Magier \t\t (5 AC, +3 INT, +2 CHA, 500 Münzen) \n"
							+ " 3)Paladain \t\t (16 AC, +2 HP, +1 KON, +1 CHA, 900 Münzen)  \n"
							+ " 4)Priester \t\t (7 AC, +1 STR, +1 KON, +1 GES, 700 Münzen) \n"
							+ " 5)Ranger \t\t (10 AC, +1 HP, +2 GES, +1 WIS, 800 Münzen)\n"
							+ " 6)Schurke \t\t (10 AC, +1 HP, +1 CHA, +1 GES, 1+ INT, 1000 Münzen)\n"
							+ " 7)Hexenmeister \t (5 AC, +2 INT, +2 CHA, +1 WIS, 700 Münzen) \n"
							+ " 8)Krieger \t\t (16 AC,+1 HP, +2 STR, +1 GES, 800 Münzen) \n");

			eingabe = scanner.nextInt();
			switch (eingabe) {
			case 1:
				System.out.println("Du Bist nun ein Barbar \nDu erhälst nun 500 Münzen");
				charakter.takeClass(new Barbar(14, 2, 1, 1, 0, 0, 0, 0, 500));
				charakter.invAdd(new Axe("Axt", "Standart-Axt eines Barbaren"));

				break;
			case 2:
				System.out.println("Du Bist nun ein Magier \nDu erhälst nun 500 Münzen");
				charakter.takeClass(new Mage(5, 0, 0, 0, 0, 2, 0, 3, 500));
				charakter.invAdd(new Staff("Stab", "Ein gewöhnlicher Stab ausb Holz"));

				break;
			case 3:
				System.out.println("Du Bist nun ein Paladin \nDu erhälst nun 900 Münzen");
				charakter.takeClass(new Paladin(16, 2, 0, 1, 0, 1, 0, 0, 900));
				charakter.invAdd(new Maul("Prügel", "Ein Heiliger-Prügel mit der Kraft der Götter versehen"));

				break;
			case 4:
				System.out.println("Du Bist nun ein Priester \nDu erhälst nun 700 Münzen");
				charakter.takeClass(new Priest(7, 1, 1, 1, 1, 0, 0, 0, 700));
				charakter.invAdd(new Staff("Stab", "Ein gewöhnlicher Stab aus Holz mit der Kraft der Götter versehen"));

				break;
			case 5:
				System.out.println("Du Bist nun ein Ranger \nDu erhälst nun 800 Münzen");
				charakter.takeClass(new Ranger(10, 1, 0, 0, 2, 0, 1, 0, 800));
				charakter.invAdd(
						new Bow("Bogen", "Ein kurviges Gestell und immer angespannt-- Könnte ne Frau sein ", 65.00));

				break;
			case 6:
				System.out.println("Du Bist nun ein Schurke \nDu erhälst nun 1000 Münzen");
				charakter.takeClass(new Rogue(10, 1, 0, 0, 1, 1, 0, 1, 1000));
				charakter.invAdd(new Dagger("Dolch", "Pieks, Pieks"));

				break;
			case 7:
				System.out.println("Du Bist nun ein Hexenmeister \nDu erhälst nun 700 Münzen");
				charakter.takeClass(new Warlock(5, 0, 0, 0, 0, 2, 1, 2, 700));
				charakter.invAdd(new Staff("Stab", "Ein gewöhnlicher Stab aus Holz mit Dömonischer Energie "));

				break;
			case 8:
				System.out.println("Du Bist nun ein Krieger \nDu erhälst nun 800 Münzen");
				charakter.takeClass(new Warrior(16, 1, 2, 0, 1, 0, 0, 0, 800));
				charakter.invAdd(
						new Sword("Schwert", "Ein Einsatz erprobtes Schwert was schon viele Kehlen von innen sah "));
				charakter.invAdd(new Shield("Schild",
						"Ein wohl gearbeitetes Stück Handwerkskunst, dass so manches Leben rettete", 2));

				break;
			default:
				System.out.println("Bitte wähle einen gültigen Wert");
				pickAClass();
				eingabe = 1;
//				punkteverteilen();
			}
		}
	}

	public void punkteverteilen() {
		int point = 6;
		while (point == 6) {
			point = 27;

			System.out.println("Du hast nun " + point + " Kostenpunkte die du ausgeben kannst");
			System.out.printf("Fähigkiten Preise\n" + " 8 Skill Points kosten 0 (MODIFIKATOR = -1)\n"
					+ " 9 Skill Points kosten 1 (MODIFIKATOR = -1)\n" + "10 Skill Points kosten 2 (MODIFIKATOR = +0)\n"
					+ "11 Skill Points kosten 3 (MODIFIKATOR = +0)\n" + "12 Skill Points kosten 4 (MODIFIKATOR = +1)\n"
					+ "13 Skill Points kosten 5 (MODIFIKATOR = +1)\n" + "14 Skill Points kosten 7 (MODIFIKATOR = +2)\n"
					+ "15 Skill Points kosten 9 (MODIFIKATOR = +2)\n"
					+ "*****BEDENKE DASS DU DURCH RASSE UND KLASSE EBENFALLS SKILLPUNKTE BEKOMMST*****\n");
			// TODO DIE PUNKTE RÜBER IN DIE CHRAKLASSE RÜBER SCHREIBEN UND MODI BERECHNEN

			System.out.println("Bitte gib die Kosten für die Stärke an die du ausgeben möchtest");

			point = strPunkte(point);
			System.out.println("Du hast noch " + point + " übrig");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("Bitte gib die Kosten für die Konstitution an die du ausgeben möchtest");
			

			point = conPunkte(point);
			System.out.println("Du hast noch " + point + " übrig");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("Bitte gib die Kosten für die Geschicklichkeit an die du ausgeben möchtest");
			

			point = dexPunkte(point);
			System.out.println("Du hast noch " + point + " übrig");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("Bitte gib die Kosten für das Charisma an die du ausgeben möchtest");
			

			point = chaPunkte(point);
			System.out.println("Du hast noch " + point + " übrig");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("Bitte gib die Kosten für die Weisheit an die du ausgeben möchtest");
		

			point = wisPunkte(point);
			System.out.println("Du hast noch " + point + " übrig");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("Bitte gib die Kosten für die Inteligenz an die du ausgeben möchtest");
			

			point = intPunkte(point);
			System.out.println("Du hast noch " + point + " übrig");
			System.out.println("--------------------------------------------------------------------------");

			if (point != 0 || point <0) {
				System.out.println("Es folgt die erneute Eingabe der Werte, du musst am Ende auf 0 kommen!");
				punkteverteilen();
			charakter.showChar();
			}
		}
	}


	public int strPunkte(int points) {
		int input = 8;
		while (input == 8) {
			input = scanner.nextInt();
			switch (input) {
			case 0:
				charakter.setStr(8);
				break;
			case 1:
				charakter.setStr(9);
				break;
			case 2:
				charakter.setStr(10);
				break;
			case 3:
				charakter.setStr(11);
				break;
			case 4:
				charakter.setStr(12);
				break;
			case 5:
				charakter.setStr(13);
				break;
			case 7:
				charakter.setStr(14);
				break;
			case 9:
				charakter.setStr(15);
				break;
			default:
				System.out.println("Bitte wähle einen gültigen Wert");
				strPunkte(points);
				input = 6;

			}
		}

		points = points - input;
		return points;
	}

	public int conPunkte(int points) {
		int input = 8;
		while (input == 8) {

			input = scanner.nextInt();

			switch (input) {
			case 0:
				charakter.setCon(8);
				break;
			case 1:
				charakter.setCon(9);
				break;
			case 2:
				charakter.setCon(10);
				break;
			case 3:
				charakter.setCon(11);
				break;
			case 4:
				charakter.setCon(12);
				break;
			case 5:
				charakter.setCon(13);
				break;
			case 7:
				charakter.setCon(14);
				break;
			case 9:
				charakter.setCon(15);
				break;
			default:
				System.out.println("Bitte wähle einen gültigen Wert");
				conPunkte(points);
				input = 6;

			}
		}

		points = points - input;
		return points;

	}

	public int dexPunkte(int points) {
		int input = 8;
		while (input == 8) {

			input = scanner.nextInt();
			switch (input) {
			case 0:
				charakter.setDex(8);
				break;
			case 1:
				charakter.setDex(9);
				break;
			case 2:
				charakter.setDex(10);
				break;
			case 3:
				charakter.setDex(11);
				break;
			case 4:
				charakter.setDex(12);
				break;
			case 5:
				charakter.setDex(13);
				break;
			case 7:
				charakter.setDex(14);
				break;
			case 9:
				charakter.setDex(15);
				break;
			default:
				System.out.println("Bitte wähle einen gültigen Wert");
				dexPunkte(points);
				input = 6;

			}
		}

		points = points - input;
		return points;

	}

	public int chaPunkte(int points) {
		int input = 8;
		while (input == 8) {

			input = scanner.nextInt();
			switch (input) {
			case 0:
				charakter.setCha(8);
				break;
			case 1:
				charakter.setCha(9);
				break;
			case 2:
				charakter.setCha(10);
				break;
			case 3:
				charakter.setCha(11);
				break;
			case 4:
				charakter.setCha(12);
				break;
			case 5:
				charakter.setCha(13);
				break;
			case 7:
				charakter.setCha(14);
				break;
			case 9:
				charakter.setCha(15);
				break;
			default:
				System.out.println("Bitte wähle einen gültigen Wert");
				chaPunkte(points);
				input = 6;

			}
		}

		points = points - input;
		return points;

	}

	public int wisPunkte(int points) {
		int input = 8;
		while (input == 8) {
			input = scanner.nextInt();
			switch (input) {
			case 0:
				charakter.setWis(8);
				break;
			case 1:
				charakter.setWis(9);
				break;
			case 2:
				charakter.setWis(10);
				break;
			case 3:
				charakter.setWis(11);
				break;
			case 4:
				charakter.setWis(12);
				break;
			case 5:
				charakter.setWis(13);
				break;
			case 7:
				charakter.setWis(14);
				break;
			case 9:
				charakter.setWis(15);
				break;
			default:
				System.out.println("Bitte wähle einen gültigen Wert");
				wisPunkte(points);
				input = 6;

			}
		}

		points = points - input;
		return points;

	}

	public int intPunkte(int points) {
		int input = 8;
		while (input == 8) {
			input = scanner.nextInt();
			switch (input) {
			case 0:
				charakter.setIntel(8);
				break;
			case 1:
				charakter.setIntel(9);
				break;
			case 2:
				charakter.setIntel(10);
				break;
			case 3:
				charakter.setIntel(11);
				break;
			case 4:
				charakter.setIntel(12);
				break;
			case 5:
				charakter.setIntel(13);
				break;
			case 7:
				charakter.setIntel(14);
				break;
			case 9:
				charakter.setIntel(15);
				break;
			default:
				System.out.println("Bitte wähle einen gültigen Wert");
				intPunkte(points);
				input = 6;

			}
		}

		points = points - input;
		return points;

	}

}
