package items.armor;

import proficiences.ArmorCategory;

public class Hide extends Armor {
	
	public Hide() {
		name = "Hide";
		weight = 12;
		price = 10;
		category = ArmorCategory.MEDIUM_ARMOR;
		armorClass = 12; //Add Dex modifier (max 2)
		stealthDisadvantage = false;
	}

}
