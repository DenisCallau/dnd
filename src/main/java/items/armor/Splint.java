package items.armor;

import proficiences.ArmorCategory;

public class Splint extends Armor {
	
	public Splint() {
		name = "Splint";
		weight = 60;
		price = 200;
		category = ArmorCategory.HEAVY_ARMOR;
		armorClass = 17;
		strength = 15;
		stealthDisadvantage = true;
	}

}
