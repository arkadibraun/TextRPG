package Data.Rasse;



public abstract class Rasse {

	private int size;
	private int str;
	private int con;
	private int dex;
	private int cha;
	private int wis;
	private int intel;

	
	/*
	 * SIZE == 0 GOBLIN AND DWARF (SMALL)
	 * SIZE == 1 HUMAN AND POSSESSED (MEDIUM)
	 * SIZE == 2 ELF AND ORCS (TALL/BIG)
	 * SIZE == 3 ....
	 * 
	 * 
	 */
	public Rasse(int size, int str, int con, int dex, int cha, int wis, int intel) {
		this.size = size;
		this.str = str;
		this.con = con;
		this.dex = dex;
		this.cha = cha;
		this.wis = wis;
		this.intel = intel;
	}



	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
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
