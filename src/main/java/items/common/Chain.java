package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Distance;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Chain extends CommonItem {

	public Chain() {
		name = "Chain";
		price = new Price(5, CurrencyUnits.GOLD);
		weight = new Weight(10, WeightUnits.POUND);
		quantity = new Distance(10, DistanceUnits.FEET);
	}

}
