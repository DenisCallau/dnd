package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class SealingWax extends CommonItem {

	public SealingWax() {
		name = "Sealing Wax";
		price = new Price(5, CurrencyUnits.SILVER);
		weight = new Weight(0, WeightUnits.POUND);
	}

}
