package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Distance;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class RopeSilk extends CommonItem {

	public RopeSilk() {
		name = "Rope (Silk)";
		price = new Price(10, CurrencyUnits.GOLD);
		weight = new Weight(5, WeightUnits.POUND);
		quantity = new Distance(50, DistanceUnits.FEET);
	}

}
