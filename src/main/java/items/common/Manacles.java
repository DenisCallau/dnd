package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Manacles extends CommonItem {

	public Manacles() {
		name = "Manacles";
		price = new Currency(2, CurrencyTypes.GOLD);
		weight = new Measure(6, MeasureUnits.POUND);
	}

}
