package items.armor;

import proficiences.ArmorCategory;

public class RingMail extends Armor {
	
	public RingMail() {
		name = "Ring Mail";
		weight = 40;
		price = 30;
		category = ArmorCategory.HEAVY_ARMOR;
		armorClass = 14;
		stealthDisadvantage = true;
	}

}
