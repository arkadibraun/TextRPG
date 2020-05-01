package Data.Objekte;

public class Axe extends Weapons {
	private double precision;
	
	public Axe(String name, String description, int str, int dex, int cha, int con, int wis, int intel, double precision) {
		super(name, description, str, dex, cha, con, wis, intel);
		this.precision = precision;
	}
}
