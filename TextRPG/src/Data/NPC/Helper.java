package Data.NPC;

public class Helper extends NPC {
	
	private int cost;
	
	public Helper(String name, int health, int atk, int armor, int cost) {
		super(name, health, atk, armor);
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
