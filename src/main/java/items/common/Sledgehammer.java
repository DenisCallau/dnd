package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Sledgehammer extends CommonItem {

	public Sledgehammer() {
		name = "Sledgehammer";
		price = new Price(2, CurrencyUnits.GOLD);
		weight = new Weight(10, WeightUnits.POUND);
	}

}
