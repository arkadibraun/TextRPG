package Logic;

import java.util.Scanner;

import Data.Charakter.Charakter;
import Data.Klassen.Klasse;

public class Game {

	Scanner scanner = new Scanner(System.in);
	static Charakter charakter;
	
	public static void main(String[] args) {
		//main
		Charakterbuild cb = new Charakterbuild();
		cb.create(charakter);

		
	}
/*
 * kekw
 */
	
	public void showOptions() {
		
		System.out.printf("Was möchtest du tun??"
				+ "(A)benteuer\t (P)rofil\n"
				+ "(I)nvetar\t (E)quipment\n"
				+ "(S)chlafen\t (O)rt");
			char input = scanner.next().charAt(0);
			
			switch(input) {
			
			case 'A':
				break;
			case 'P':
				charakter.showChar();
				break;
			case 'I':
				charakter.showInv();
				break;
			case 'E':
				System.out.println("Möchtest du eine (W)affe oder ein (S)child anlegen??");
				char in = scanner.next().charAt(0);
				break;
			case 'S':
				charakter.klassse.setHealth(charakter.klassse.getMaxHealth());
				System.out.println("Du hast eine ruhige Nacht hinter dir und deine Gesundheit\n"
						+ "ist vollständig aufgefüllt.");
			case 'O':
				break;
			default:
				
			
			}
		
		
	}
	
	
	
	
}
