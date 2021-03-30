package items.armor;

import proficiences.ArmorCategory;

public class ChainMail extends Armor {
	
	public ChainMail() {
		name = "Chain Mail";
		weight = 55;
		price = 75;
		category = ArmorCategory.HEAVY_ARMOR;
		armorClass = 16;
		strength = 13;
		stealthDisadvantage = true;
	}

}
