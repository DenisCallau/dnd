package items.armor;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.ArmorCategory;

public class Leather extends Armor {
	
	public Leather() {
		name = "Leather";
		weight = new Weight(10, WeightUnits.POUND);
		price = new Price(10, CurrencyUnits.GOLD);
		category = ArmorCategory.LIGHT_ARMOR;
		armorClass = 11; //Add Dex modifier
		stealthDisadvantage = false;
	}

}
