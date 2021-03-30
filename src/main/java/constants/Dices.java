package constants;

import java.util.Random;

public enum Dices {
	
	D4(4),
	D6(6),
	D8(8),
	D10(10),
	D12(12),
	D20(20),
	D100(100);
	
	private int sides;
	
	Dices(int sides) {
		this.sides = sides;
	}

	public int roll() {
		Random r = new Random();
		return r.nextInt(sides) + 1;
	}

}
