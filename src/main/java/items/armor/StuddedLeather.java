package items.armor;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.ArmorCategory;

public class StuddedLeather extends Armor {
	
	public StuddedLeather() {
		name = "Studded Leather";
		weight = new Weight(13, WeightUnits.POUND);
		price = new Price(45, CurrencyUnits.GOLD);
		category = ArmorCategory.LIGHT_ARMOR;
		armorClass = 12; //Add Dex modifier
		stealthDisadvantage = false;
	}

}
