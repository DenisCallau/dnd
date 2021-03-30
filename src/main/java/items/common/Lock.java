package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Lock extends CommonItem {

	public Lock() {
		name = "Lock";
		price = new Currency(10, CurrencyTypes.GOLD);
		weight = new Measure(1, MeasureUnits.POUND);
	}

}
