package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Pole extends CommonItem {

	public Pole() {
		name = "Pole";
		price = new Currency(5, CurrencyTypes.COPPER);
		weight = new Measure(7, MeasureUnits.POUND);
		quantity = new Measure(10, MeasureUnits.FEET);
	}

}
