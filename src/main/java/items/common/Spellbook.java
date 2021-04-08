package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Spellbook extends CommonItem {

	public Spellbook() {
		name = "Spellbook";
		price = new Price(50, CurrencyUnits.GOLD);
		weight = new Weight(3, WeightUnits.POUND);
	}

}
