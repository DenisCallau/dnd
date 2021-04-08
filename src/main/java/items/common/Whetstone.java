package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Whetstone extends CommonItem {

	public Whetstone() {
		name = "Whetstone";
		price = new Price(1, CurrencyUnits.COPPER);
		weight = new Weight(1, WeightUnits.POUND);
	}

}
