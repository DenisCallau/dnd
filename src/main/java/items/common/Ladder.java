package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Distance;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Ladder extends CommonItem {

	public Ladder() {
		name = "Ladder";
		price = new Price(1, CurrencyUnits.SILVER);
		weight = new Weight(25, WeightUnits.POUND);
		quantity = new Distance(10, DistanceUnits.FEET);
	}

}
