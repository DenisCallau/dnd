package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Tinderbox extends CommonItem {

	public Tinderbox() {
		name = "Tinderbox";
		price = new Price(5, CurrencyUnits.SILVER);
		weight = new Weight(1, WeightUnits.POUND);
	}

}
