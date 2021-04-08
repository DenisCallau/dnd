package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class MagnifyingGlass extends CommonItem {

	public MagnifyingGlass() {
		name = "Magnifying Glass";
		price = new Price(100, CurrencyUnits.GOLD);
		weight = new Weight(0, WeightUnits.POUND);
	}

}
