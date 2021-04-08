package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Distance;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Pole extends CommonItem {

	public Pole() {
		name = "Pole";
		price = new Price(5, CurrencyUnits.COPPER);
		weight = new Weight(7, WeightUnits.POUND);
		quantity = new Distance(10, DistanceUnits.FEET);
	}

}
