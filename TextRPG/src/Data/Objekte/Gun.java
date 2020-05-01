package Data.Objekte;

public class Gun extends Weapons {

	private double precision;
	
	public Gun(String name, String description, double precision) {
		super(name, description);
		this.precision = precision;
	}
}
