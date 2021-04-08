package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Distance;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class RopeHemp extends CommonItem {

	public RopeHemp() {
		name = "Rope (Hemp)";
		price = new Price(1, CurrencyUnits.GOLD);
		weight = new Weight(10, WeightUnits.POUND);
		quantity = new Distance(50, DistanceUnits.FEET);
	}

}
