package items.armor;

import proficiences.ArmorCategory;

public class Breastplate extends Armor {
	
	public Breastplate() {
		name = "Breastplate";
		weight = 20;
		price = 400;
		category = ArmorCategory.MEDIUM_ARMOR;
		armorClass = 14; //Add Dex modifier (max 2)
		stealthDisadvantage = false;
	}


}
