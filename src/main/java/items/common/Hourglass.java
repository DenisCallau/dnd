package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Hourglass extends CommonItem {

	public Hourglass() {
		name = "Hourglass";
		price = new Price(25, CurrencyUnits.GOLD);
		weight = new Weight(1, WeightUnits.POUND);
	}

}
