package Data.Objekte;

public class Bow extends Weapons{

	private double precision;
	
	public Bow(String name, String description, double precision) {
		super(name, description);
		this.precision = precision;
	}
}
