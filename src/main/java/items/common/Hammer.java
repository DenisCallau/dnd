package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Hammer extends CommonItem {

	public Hammer() {
		name = "Hammer";
		price = new Currency(1, CurrencyTypes.GOLD);
		weight = new Measure(3, MeasureUnits.POUND);
	}

}
