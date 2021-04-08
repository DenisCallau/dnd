package items.armor;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.ArmorCategory;

public class Padded extends Armor {
	
	public Padded() {
		name = "Padded";
		weight = new Weight(8, WeightUnits.POUND);
		price = new Price(5, CurrencyUnits.GOLD);
		category = ArmorCategory.LIGHT_ARMOR;
		armorClass = 11; //Add Dex modifier
		stealthDisadvantage = true;
	}

}
