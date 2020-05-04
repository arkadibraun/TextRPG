package Logic;

import Data.Enemies.*;

public class Exp {

	Enemy enemys;
	private int experience;
	private int level;
	private int experienceToNextLevel;
	private int maxLevel;
	private int xpLevelBegin;
	private int xpLevelLast;

	public Exp() {
		maxLevel = 20;
		xpLevelBegin = 300;
		xpLevelLast = 355000;
		experienceToNextLevel = 0;
		level = 1;
		experience = 0;
	}

	public int berechneLevelXP() {
		
		double b = Math.log(1.0 * xpLevelLast / xpLevelBegin) / (maxLevel - 1);
		double a = 1.0 * xpLevelBegin / (Math.exp(b) - 1.0);
		for (int i = 1; i <= level; i++) {

			int altexp = (int) Math.round(a * Math.exp(b * (i - 1)));
			int newxp = (int) Math.round(a * Math.exp(b * i));
			experienceToNextLevel = newxp -altexp;
		}
		return experienceToNextLevel;
	}

	public int charLevelUp(int amount) {	
		experience += amount;
		if (experience >= berechneLevelXP()) {
			level++;
			experience -= experienceToNextLevel;
		}
		return experience;
	}

	public int enemyExp() {
		if (enemys.getHealth() == 0) {
			// exp berechnen mit Kategorie
			experience = 10 * 20;
		} else {
			//tod des spielers
		}
		return charLevelUp(experience);
	}
	
	/*
	 * 
	 * Getter und Setter
	 * 
	 */
	
	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void setLevel(int level) {
		this.level = level;
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

	public void setExperienceToNextLevel(int experienceToNextLevel) {
		this.experienceToNextLevel = experienceToNextLevel;
	}

}
