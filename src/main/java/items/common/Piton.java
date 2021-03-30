package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class Piton extends CommonItem {

	public Piton() {
		name = "Piton";
		price = new Currency(5, CurrencyTypes.COPPER);
		weight = new Measure(25, MeasureUnits.POUND);
	}

}
