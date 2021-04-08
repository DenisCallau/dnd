package items.armor;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.ArmorCategory;

public class Breastplate extends Armor {
	
	public Breastplate() {
		name = "Breastplate";
		weight = new Weight(20, WeightUnits.POUND);
		price = new Price(400, CurrencyUnits.GOLD);
		category = ArmorCategory.MEDIUM_ARMOR;
		armorClass = 14; //Add Dex modifier (max 2)
		stealthDisadvantage = false;
	}


}
