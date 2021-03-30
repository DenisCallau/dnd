package items.armor;

import proficiences.ArmorCategory;

public class ChainShirt extends Armor {
	
	public ChainShirt() {
		name = "Chain Shirt";
		weight = 20;
		price = 50;
		category = ArmorCategory.MEDIUM_ARMOR;
		armorClass = 13; //Add Dex modifier (max 2)
		stealthDisadvantage = false;
	}

}
