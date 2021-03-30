package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class LanternBullseye extends CommonItem {

	public LanternBullseye() {
		name = "Lantern Bullseye";
		price = new Currency(10, CurrencyTypes.GOLD);
		weight = new Measure(2, MeasureUnits.POUND);
	}

}
