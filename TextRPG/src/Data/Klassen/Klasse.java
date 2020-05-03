package Data.Klassen;

public class Klasse {

	// private String cName;
	private int armor;
	private int health;
	private int str;
	private int con;
	private int dex;
	private int cha;
	private int wis;
	private int intel;
	private int money;
	private int maxHealth;

	public Klasse(int armor, int health, int str, int con, int dex, int cha, int wis, int intel, int money) {
		this.armor = armor;
		this.con = con;
		this.dex = dex;
		this.cha = cha;
		this.health = health;
		this.money = money;
		this.wis = wis;
		this.str = str;
		this.intel = intel;
		
	}
//hbsdck
	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
