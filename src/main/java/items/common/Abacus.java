package items.common;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;

public class Abacus extends CommonItem {

	public Abacus() {
		name = "Abacus";
		price = new Price(2, CurrencyUnits.GOLD);
		weight = new Weight(2, WeightUnits.POUND);
	}

}
