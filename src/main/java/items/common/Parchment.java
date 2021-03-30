package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Parchment extends CommonItem {

	public Parchment() {
		name = "Parchment";
		price = new Currency(1, CurrencyTypes.SILVER);
		weight = new Measure(0, MeasureUnits.NULL);
		quantity = new Measure(1, MeasureUnits.SHEET);
	}

}
