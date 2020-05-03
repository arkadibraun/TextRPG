package Data.Enemies;

public class Boss extends Enemy {
	private double multiplier;

	public Boss(int health, int atk, int armor, String name ,double multiplier, int challangerCat) {
		super(health, atk, armor, name, challangerCat);
		this.multiplier = multiplier;
	}

	public int bossLife() {
		int health = super.getHealth();
		health *= multiplier;
		
		return health;
	}

	public int bossArmor() {
		int armor = super.getArmor();
		armor *= multiplier;
		
		return armor;
	}

}
