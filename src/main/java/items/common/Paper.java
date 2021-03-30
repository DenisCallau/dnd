package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Paper extends CommonItem {

	public Paper() {
		name = "Paper";
		price = new Currency(2, CurrencyTypes.SILVER);
		weight = new Measure(0, MeasureUnits.NULL);
		quantity = new Measure(1, MeasureUnits.PIECE);
	}

}
