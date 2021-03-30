package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Hourglass extends CommonItem {

	public Hourglass() {
		name = "Hourglass";
		price = new Currency(25, CurrencyTypes.GOLD);
		weight = new Measure(1, MeasureUnits.POUND);
	}

}
