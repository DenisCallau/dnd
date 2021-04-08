package items.armor;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.ArmorCategory;

public class RingMail extends Armor {
	
	public RingMail() {
		name = "Ring Mail";
		weight = new Weight(40, WeightUnits.POUND);
		price = new Price(30, CurrencyUnits.GOLD);
		category = ArmorCategory.HEAVY_ARMOR;
		armorClass = 14;
		stealthDisadvantage = true;
	}

}
