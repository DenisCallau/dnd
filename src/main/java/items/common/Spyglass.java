package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Spyglass extends CommonItem {

	public Spyglass() {
		name = "Spyglass";
		price = new Price(1000, CurrencyUnits.GOLD);
		weight = new Weight(1, WeightUnits.POUND);
	}

}
