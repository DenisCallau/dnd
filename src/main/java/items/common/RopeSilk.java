package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class RopeSilk extends CommonItem {

	public RopeSilk() {
		name = "Rope (Silk)";
		price = new Currency(10, CurrencyTypes.GOLD);
		weight = new Measure(5, MeasureUnits.POUND);
		quantity = new Measure(50, MeasureUnits.FEET);
	}

}
