package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Bell extends CommonItem {

	public Bell() {
		name = "Bell";
		price = new Currency(1, CurrencyTypes.GOLD);
		weight = new Measure(0, MeasureUnits.NULL);
	}

}
