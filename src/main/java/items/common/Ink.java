package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Ink extends CommonItem {

	public Ink() {
		name = "Ink";
		price = new Price(10, CurrencyUnits.GOLD);
		weight = new Weight(0, WeightUnits.POUND);
		quantity = new Weight(1, WeightUnits.OUNCE);
	}

}
