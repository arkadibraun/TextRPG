package Data.Objekte;

public class Gun extends Weapons {

	private double precision;
	
	public Gun(String name, String description, int str, int dex, int cha, int con, int wis, int intel, double precision) {
		super(name, description, str, dex, cha, con, wis, intel);
		this.precision = precision;
	}
}
