package Data.Objekte;

public class Shield extends Weapons {

	public int armor;
	
	public Shield(String name, String description, int armor) {
		super(name, description);
		this.armor = armor;
	}
}
