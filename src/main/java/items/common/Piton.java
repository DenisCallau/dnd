package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Piton extends CommonItem {

	public Piton() {
		name = "Piton";
		price = new Price(5, CurrencyUnits.COPPER);
		weight = new Weight(25, WeightUnits.POUND);
	}

}
