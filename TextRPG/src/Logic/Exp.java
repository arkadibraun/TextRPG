package Logic;

import Data.Enemies.*;

public class Exp {
	
	Enemy enemys;
	private int experience;
	private int level;
	private int experienceToNextLevel;
	public Exp() {
		level = 1;
		experience = 0;
		experienceToNextLevel = 100;
	}
	
	public int enemyExp() {
		if(enemys.getHealth() == 0) {
			// exp berechnen mit Kategorie
			experience = 10*20;
		}else {
		}
		return 0;
	}
	
	public int maxExperienceCalc() {
		experienceToNextLevel = level*300;
		
		if(level > 2) {
			experienceToNextLevel*= 2.5; 
		}
		
		return experienceToNextLevel;
	}
		
	public void charLvelUp(int amount) {
		experience += amount;
		if(experience >= experienceToNextLevel) {
			level++;
			experience -= experienceToNextLevel;
		}
		return;
	}

	public int getXp() {
		return experience;
	}
	
	public int getExperienceToNextLevel() {
		return experienceToNextLevel;
	}

	public int getLevel() {
		return level;
	}
	
}
