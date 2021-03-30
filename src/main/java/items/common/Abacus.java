package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Abacus extends CommonItem {

	public Abacus() {
		name = "Abacus";
		price = new Currency(2, CurrencyTypes.GOLD);
		weight = new Measure(2, MeasureUnits.POUND);
	}

}
