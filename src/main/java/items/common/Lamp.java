package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Lamp extends CommonItem {

	public Lamp() {
		name = "Lamp";
		price = new Currency(5, CurrencyTypes.SILVER);
		weight = new Measure(1, MeasureUnits.POUND);
	}

}
