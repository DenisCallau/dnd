package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Shovel extends CommonItem {

	public Shovel() {
		name = "Shovel";
		price = new Price(2, CurrencyUnits.GOLD);
		weight = new Weight(5, WeightUnits.POUND);
	}

}
