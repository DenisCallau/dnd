package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Bedroll extends CommonItem {

	public Bedroll() {
		name = "Bedroll";
		price = new Currency(1, CurrencyTypes.GOLD);
		weight = new Measure(2, MeasureUnits.POUND);
	}

}
