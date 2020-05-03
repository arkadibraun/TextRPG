package Logic;

import java.util.Scanner;

import Data.Charakter.Charakter;
import Data.Klassen.Klasse;

public class Game {

	static Scanner scanner = new Scanner(System.in);
	static Charakter charakter;
	
	public static void main(String[] args) {
		//main
		boolean run = true;
		Charakterbuild cb = new Charakterbuild();
		 charakter = cb.create(charakter);

		while(run) {
			showOptions();
		}
		
		
	}
/*
 * kekw
 */
	
	public static void showOptions() {
		
		System.out.printf("Was möchtest du tun??\n"
				+ "(A)benteuer\t (P)rofil\n"
				+ "(I)nvetar\t (E)quipment\n"
				+ "(S)chlafen\t (O)rt\n"
				+ "--------------------------------------------------------------------------\n");
			char input = scanner.next().toUpperCase().charAt(0);
			
			switch(input) {
			
			case 'A':
				//ABENTEUER TO DO
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
				switch (in) {
				case 'W':
					charakter.equipWeapon(scanner.next().toUpperCase());
					break;
				case 'S':
					charakter.equipShield(scanner.next().toUpperCase());
					break;
				}
				break;
			case 'S':
				charakter.klassse.setHealth(charakter.klassse.getMaxHealth());
				System.out.println("Du hast eine ruhige Nacht hinter dir und deine Gesundheit\n"
						+ "ist vollständig aufgefüllt.");
			case 'O':
				// ORTE SIND NOCH TO DO
				break;
			default:
				
			
			}
		
		
	}
	
	
	
	
}
