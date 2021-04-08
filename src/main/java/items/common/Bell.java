package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class Bell extends CommonItem {

	public Bell() {
		name = "Bell";
		price = new Price(1, CurrencyUnits.GOLD);
		weight = new Weight(0, WeightUnits.POUND);
	}

}
