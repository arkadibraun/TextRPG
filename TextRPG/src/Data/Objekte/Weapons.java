package Data.Objekte;

public abstract class Weapons extends Item {

	private String category;
	private int str;
	private int dex;
	private int cha;
	private int con;
	private int wis;
	private int intel;

	public Weapons(String name, String description, int str, int dex, int cha, int con, int wis, int intel) {
		super(name, description);
		this.str = str;
		this.dex = dex;
		this.cha = cha;
		this.con = con;
		this.wis = wis;
		this.intel = intel;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getCha() {
		return cha;
	}

	public void setCha(int cha) {
		this.cha = cha;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public int getWis() {
		return wis;
	}

	public void setWis(int wis) {
		this.wis = wis;
	}

	public int getIntel() {
		return intel;
	}

	public void setIntel(int intel) {
		this.intel = intel;
	}

}
