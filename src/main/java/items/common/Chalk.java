package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Chalk extends CommonItem {

	public Chalk() {
		name = "Chalk";
		price = new Currency(1, CurrencyTypes.COPPER);
		weight = new Measure(0, MeasureUnits.NULL);
		quantity = new Measure(1, MeasureUnits.PIECE);
	}

}
