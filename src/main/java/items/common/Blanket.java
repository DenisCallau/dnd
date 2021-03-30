package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Blanket extends CommonItem {

	public Blanket() {
		name = "Blanket";
		price = new Currency(5, CurrencyTypes.SILVER);
		weight = new Measure(5, MeasureUnits.POUND);
	}

}
