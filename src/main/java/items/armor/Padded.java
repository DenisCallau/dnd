package items.armor;

import proficiences.ArmorCategory;

public class Padded extends Armor {
	
	public Padded() {
		name = "Padded";
		weight = 8;
		price = 5;
		category = ArmorCategory.LIGHT_ARMOR;
		armorClass = 11; //Add Dex modifier
		stealthDisadvantage = true;
	}

}
