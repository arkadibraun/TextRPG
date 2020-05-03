package Data.NPC;

public class NPC {

	private String name;
	private int health;
	private int atk;
	private int armor;
	
	public NPC(String name, int health, int ark, int armor) {
		this.name = name;
		this.health = health;
		this.atk = atk;
		this.armor = armor;
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
