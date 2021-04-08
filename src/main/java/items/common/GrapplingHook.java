package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class GrapplingHook extends CommonItem {

	public GrapplingHook() {
		name = "Grappling Hook";
		price = new Price(2, CurrencyUnits.GOLD);
		weight = new Weight(4, WeightUnits.POUND);
	}

}
