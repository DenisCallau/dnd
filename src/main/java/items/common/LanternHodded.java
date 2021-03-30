package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class LanternHodded extends CommonItem {

	public LanternHodded() {
		name = "Lantern Hodded";
		price = new Currency(5, CurrencyTypes.GOLD);
		weight = new Measure(2, MeasureUnits.POUND);
	}

}
