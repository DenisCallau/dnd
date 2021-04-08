package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Lamp extends CommonItem {

	public Lamp() {
		name = "Lamp";
		price = new Price(5, CurrencyUnits.SILVER);
		weight = new Weight(1, WeightUnits.POUND);
	}

}
