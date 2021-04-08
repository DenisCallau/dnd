package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class LanternHodded extends CommonItem {

	public LanternHodded() {
		name = "Lantern Hodded";
		price = new Price(5, CurrencyUnits.GOLD);
		weight = new Weight(2, WeightUnits.POUND);
	}

}
