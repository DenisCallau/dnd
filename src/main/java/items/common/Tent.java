package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Tent extends CommonItem {

	public Tent() {
		name = "Tent";
		price = new Currency(2, CurrencyTypes.GOLD);
		weight = new Measure(20, MeasureUnits.POUND);
		quantity = new Measure(2, MeasureUnits.PERSON);
	}

}
