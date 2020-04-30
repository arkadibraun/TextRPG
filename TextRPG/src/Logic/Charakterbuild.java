package Logic;

import Data.Charakter.Charakter;

import java.util.Scanner;

public class Charakterbuild {

	Charakter charakter;
	Scanner scanner = new Scanner(System.in);

	public void create() {
		
		System.out.println("Bitte nenne mir deinen Namen:");
		String name = scanner.next();
		charakter = new Charakter(name);
		System.out.println("Wilkommen "+ name + " in der Welt von Ravnica. Nimm dich vor Gefahren in Acht");
		pickARace();
		pickAClass();
	}
	
	

	public void pickARace() {
		System.out.printf(
				"Bitte wähle eine Rasse aus\n 1)Zwerg\n 2)Elf \n 3)Goblin \n 4)Mensch \n5)Ork \n6)Besessener \n");

		switch (scanner.nextInt()) {
		case 1:
			System.out.println("Du Bist nun ein Zwerg,wähle bitte nun eine Klasse-->");
			break;
		case 2:
			System.out.println("Du Bist nun ein Elf, wähle bitte nun eine Klasse-->");
			break;
		case 3:
			System.out.println("Du Bist nun ein Goblin, wähle bitte nun eine Klasse-->");
			break;
		case 4:
			System.out.println("Du Bist nun ein Mensch, wähle bitte nun eine Klasse-->");
			break;
		case 5:
			System.out.println("Du Bist nun ein Ork, wähle bitte nun eine Klasse-->");
			break;
		case 6:
			System.out.println("Du Bist nun ein Besessener, wähle bitte nun eine Klasse-->");
			break;
		default:
			System.out.println("Bitte eine gültige Eingabe zwischen 1 und 6 machen");

		}
	}

	public void pickAClass() {

	}

}
