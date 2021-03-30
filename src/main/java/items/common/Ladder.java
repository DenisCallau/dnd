package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Ladder extends CommonItem {

	public Ladder() {
		name = "Ladder";
		price = new Currency(1, CurrencyTypes.SILVER);
		weight = new Measure(25, MeasureUnits.POUND);
		quantity = new Measure(10, MeasureUnits.FEET);
	}

}
