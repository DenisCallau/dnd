package items.armor;

import proficiences.ArmorCategory;

public class HalfPlate extends Armor {
	
	public HalfPlate() {
		name = "Half Plate";
		weight = 40;
		price = 750;
		category = ArmorCategory.MEDIUM_ARMOR;
		armorClass = 15; //Add Dex modifier (max 2)
		stealthDisadvantage = true;
	}

}
