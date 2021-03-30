package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class GrapplingHook extends CommonItem {

	public GrapplingHook() {
		name = "Grappling Hook";
		price = new Currency(2, CurrencyTypes.GOLD);
		weight = new Measure(4, MeasureUnits.POUND);
	}

}
