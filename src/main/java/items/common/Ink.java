package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Ink extends CommonItem {

	public Ink() {
		name = "Ink";
		price = new Currency(10, CurrencyTypes.GOLD);
		weight = new Measure(0, MeasureUnits.NULL);
		quantity = new Measure(1, MeasureUnits.OUNCE);
	}

}
