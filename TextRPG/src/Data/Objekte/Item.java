package Data.Objekte;

public abstract class Item {

	private String name;
	private int id;
	private String description;
	private static int counter = 0;
	
	public Item(String name, String description) {
		this.name = name;
		this.description = description;
		int id = counter++;
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getId() {
		return this.id;
	}
}
