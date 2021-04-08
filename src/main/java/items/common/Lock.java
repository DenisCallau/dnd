package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Lock extends CommonItem {

	public Lock() {
		name = "Lock";
		price = new Price(10, CurrencyUnits.GOLD);
		weight = new Weight(1, WeightUnits.POUND);
	}

}
