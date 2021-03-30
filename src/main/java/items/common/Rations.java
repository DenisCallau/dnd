package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Rations extends CommonItem {

	public Rations() {
		name = "Rations";
		price = new Currency(5, CurrencyTypes.SILVER);
		weight = new Measure(2, MeasureUnits.POUND);
		quantity = new Measure(1, MeasureUnits.DAY);
	}

}
