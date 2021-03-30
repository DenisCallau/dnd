package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Shovel extends CommonItem {

	public Shovel() {
		name = "Shovel";
		price = new Currency(2, CurrencyTypes.GOLD);
		weight = new Measure(5, MeasureUnits.POUND);
	}

}
