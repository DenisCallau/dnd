package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Crowbar extends CommonItem {

	public Crowbar() {
		name = "Crowbar";
		price = new Currency(2, CurrencyTypes.GOLD);
		weight = new Measure(5, MeasureUnits.POUND);
	}

}
