package Data.Objekte;

public abstract class Weapons extends Item {

	private String category;
	

	public Weapons(String name, String description) {
		super(name, description);
		
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}


	

}
