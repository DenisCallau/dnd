package items.armor;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.ArmorCategory;

public class ChainMail extends Armor {
	
	public ChainMail() {
		name = "Chain Mail";
		weight = new Weight(55, WeightUnits.POUND);
		price = new Price(75, CurrencyUnits.GOLD);
		category = ArmorCategory.HEAVY_ARMOR;
		armorClass = 16;
		strength = 13;
		stealthDisadvantage = true;
	}

}
