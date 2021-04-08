package items.armor;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.ArmorCategory;

public class ScaleMail extends Armor {
	
	public ScaleMail() {
		name = "Scale Mail";
		weight = new Weight(45, WeightUnits.POUND);
		price = new Price(50, CurrencyUnits.GOLD);
		category = ArmorCategory.MEDIUM_ARMOR;
		armorClass = 14; //Add Dex modifier (max 2)
		stealthDisadvantage = true;
	}

}
