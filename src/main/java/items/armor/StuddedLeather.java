package items.armor;

import proficiences.ArmorCategory;

public class StuddedLeather extends Armor {
	
	public StuddedLeather() {
		name = "Studded Leather";
		weight = 13;
		price = 45;
		category = ArmorCategory.LIGHT_ARMOR;
		armorClass = 12; //Add Dex modifier
		stealthDisadvantage = false;
	}

}
