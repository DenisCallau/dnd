package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Chain extends CommonItem {

	public Chain() {
		name = "Chain";
		price = new Currency(5, CurrencyTypes.GOLD);
		weight = new Measure(10, MeasureUnits.POUND);
		quantity = new Measure(10, MeasureUnits.FEET);
	}

}
