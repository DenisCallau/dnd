package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class Bedroll extends CommonItem {

	public Bedroll() {
		name = "Bedroll";
		price = new Price(1, CurrencyUnits.GOLD);
		weight = new Weight(2, WeightUnits.POUND);
	}

}
