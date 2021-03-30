package items.armor;

import proficiences.ArmorCategory;

public class ScaleMail extends Armor {
	
	public ScaleMail() {
		name = "Scale Mail";
		weight = 45;
		price = 50;
		category = ArmorCategory.MEDIUM_ARMOR;
		armorClass = 14; //Add Dex modifier (max 2)
		stealthDisadvantage = true;
	}

}
