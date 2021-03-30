package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class MagnifyingGlass extends CommonItem {

	public MagnifyingGlass() {
		name = "Magnifying Glass";
		price = new Currency(100, CurrencyTypes.GOLD);
		weight = new Measure(0, MeasureUnits.NULL);
	}

}
