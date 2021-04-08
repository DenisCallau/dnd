package items.armor;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.ArmorCategory;

public class Hide extends Armor {
	
	public Hide() {
		name = "Hide";
		weight = new Weight(12, WeightUnits.POUND);
		price = new Price(10, CurrencyUnits.GOLD);
		category = ArmorCategory.MEDIUM_ARMOR;
		armorClass = 12; //Add Dex modifier (max 2)
		stealthDisadvantage = false;
	}

}
