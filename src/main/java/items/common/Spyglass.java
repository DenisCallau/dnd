package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Spyglass extends CommonItem {

	public Spyglass() {
		name = "Spyglass";
		price = new Currency(1000, CurrencyTypes.GOLD);
		weight = new Measure(1, MeasureUnits.POUND);
	}

}
