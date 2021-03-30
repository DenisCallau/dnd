package items.armor;

import proficiences.ArmorCategory;

public class Shield extends Armor {
	
	public Shield() {
		name = "Shield";
		weight = 6;
		price = 10;
		category = ArmorCategory.SHIELDS;
		armorClass = 2;
		stealthDisadvantage = false;
	}

}
