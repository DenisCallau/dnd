package items.armor;

import proficiences.ArmorCategory;

public class Leather extends Armor {
	
	public Leather() {
		name = "Leather";
		weight = 10;
		price = 10;
		category = ArmorCategory.LIGHT_ARMOR;
		armorClass = 11; //Add Dex modifier
		stealthDisadvantage = false;
	}

}
