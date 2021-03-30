package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Whetstone extends CommonItem {

	public Whetstone() {
		name = "Whetstone";
		price = new Currency(1, CurrencyTypes.COPPER);
		weight = new Measure(1, MeasureUnits.POUND);
	}

}
