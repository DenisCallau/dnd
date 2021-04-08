package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Torch extends CommonItem {

	public Torch() {
		name = "Torch";
		price = new Price(1, CurrencyUnits.COPPER);
		weight = new Weight(1, WeightUnits.POUND);
	}

}
