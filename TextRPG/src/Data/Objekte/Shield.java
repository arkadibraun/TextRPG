package Data.Objekte;

public class Shield extends Weapons {

	public int armor;
	
	public Shield(String name, String description, int str, int dex, int cha, int con, int wis, int intel, int armor) {
		super(name, description, str, dex, cha, con, wis, intel);
		this.armor = armor;
	}
}
