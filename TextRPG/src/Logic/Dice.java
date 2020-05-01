package Logic;

import java.util.Random;

public class Dice {

	Random rand = new Random();
	
	public int rollD4() {
		return rand.nextInt(4)+1;
	}

	public int rollD6() {
		return rand.nextInt(6)+1;
	}

	public int rollD8() {
		return rand.nextInt(8)+1;
	}

	public int rollD10() {
		return rand.nextInt(10)+1;
	}

	public int rollD12() {
		return rand.nextInt(12)+1;
	}

	public int rollD20() {
		return rand.nextInt(20)+1;
	}

	public double rollD100() {
		return rand.nextInt(100)+1;
	}

}
