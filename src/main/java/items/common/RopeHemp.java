package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class RopeHemp extends CommonItem {

	public RopeHemp() {
		name = "Rope (Hemp)";
		price = new Currency(1, CurrencyTypes.GOLD);
		weight = new Measure(10, MeasureUnits.POUND);
		quantity = new Measure(50, MeasureUnits.FEET);
	}

}
