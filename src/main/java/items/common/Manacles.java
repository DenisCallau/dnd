package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Manacles extends CommonItem {

	public Manacles() {
		name = "Manacles";
		price = new Price(2, CurrencyUnits.GOLD);
		weight = new Weight(6, WeightUnits.POUND);
	}

}
