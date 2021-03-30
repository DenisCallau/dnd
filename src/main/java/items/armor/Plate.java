package items.armor;

import proficiences.ArmorCategory;

public class Plate extends Armor {
	
	public Plate() {
		name = "Plate";
		weight = 65;
		price = 1500;
		category = ArmorCategory.HEAVY_ARMOR;
		armorClass = 18;
		strength = 15;
		stealthDisadvantage = true;
	}

}
