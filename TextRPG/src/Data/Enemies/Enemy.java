package Data.Enemies;

public abstract class Enemy {
	private int health;
	private int atk;
	private int armor;
	private String name;
	private int challangerCat;
	
	public Enemy(int health, int atk, int armor, String name, int challangerCat) {
		this.health = health;
		this.atk = atk;
		this.armor = armor;
		this.name = name;
		this.challangerCat = challangerCat;
	}

	public int getChallangerCat() {
		return challangerCat;
	}

	public void setChallangerCat(int challangerCat) {
		this.challangerCat = challangerCat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
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

}
