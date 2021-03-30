package items.common;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class SealingWax extends CommonItem {

	public SealingWax() {
		name = "Sealing Wax";
		price = new Currency(5, CurrencyTypes.SILVER);
		weight = new Measure(0, MeasureUnits.NULL);
	}

}
