package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Sledgehammer extends CommonItem {

	public Sledgehammer() {
		name = "Sledgehammer";
		price = new Currency(2, CurrencyTypes.GOLD);
		weight = new Measure(10, MeasureUnits.POUND);
	}

}
