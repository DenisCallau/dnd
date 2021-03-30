package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Candle extends CommonItem {

	public Candle() {
		name = "Candle";
		price = new Currency(1, CurrencyTypes.COPPER);
		weight = new Measure(0, MeasureUnits.NULL);
	}

}
